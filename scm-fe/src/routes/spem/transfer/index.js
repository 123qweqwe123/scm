import React from 'react'
import PropTypes from 'prop-types'
import { routerRedux } from 'dva/router'
import { connect } from 'dva'
import List from './List'
import Master from './Master'
import Filter from './Filter'
import Lightbox from 'react-images'
import DownloadButton from '../../../components/DownloadButton'
import { Tabs, Icon, Modal } from 'antd'
import MasterEmailModal from './MasterEmailModal'
import PreviewModal from './PreviewModal'
import lodash from 'lodash'
import styles from './index.less'


const TabPane = Tabs.TabPane

const SpemTransfer = ({ location, dispatch, transfer, loading }) => {
  const {
    list, pagination, siblingList, siblingPagination,
    subList, isMotion, statusList,
    previewVisible, images, currentImage,
    master, transNoTitle,
    modalVisible, modalItem,
    previewModalVisible,
  } = transfer

  const listProps = {
    pagination,
    siblingPagination,
    location,
    isMotion,
    subList,
    dataSource: list,
    siblingDataSource: siblingList,
    loading: loading.effects['transfer/query'],
    onChange (page) {
      const { query } = location
      dispatch({
        type: 'transfer/query',
        payload: {
          ...query,
          page: page.current,
          pageSize: page.pageSize
        }
      })
    },
    onChangeSibling (page) {
      const { query } = location
      dispatch({
        type: 'transfer/queryUnTransfers',
        payload: {
          ...query,
          page: page.current,
          pageSize: page.pageSize
        }
      })
    },
    onExpand(isExpand, record) {
      if (isExpand) {
        dispatch({
          type: 'transfer/queryDetail',
          payload: { transId: record.id }
        })
      }
    },
    preview(e, record) {
      e.stopPropagation()
      dispatch({
        type: 'transfer/queryImages',
        payload: {
          transId: record.masterId,
          detailId: record.id
        }
      })
    },
    onDeliver(transId) {
      dispatch({
        type: 'transfer/deliver',
        payload: {
          transId
        }
      })
    }
  }

  const filterProps = {
    isMotion,
    statusList,
    filter: {
      ...location.query,
    },
    onFilterChange (value) {
      dispatch(routerRedux.push({
        pathname: location.pathname,
        query: {
          ...value,
        },
      }))
    },
    switchIsMotion () {
      dispatch({ type: 'transfer/switchIsMotion' })
    },
  }

  const download = () => {
    dispatch({
      type: 'app/download',
      payload: { fileId: images[currentImage].fileId }
    })
  }

  const previewProps = {
    showThumbnails: true,
    customControls: [<DownloadButton key="1" handler={download} />],
    currentImage: currentImage,
    images: images,
    isOpen: previewVisible,
    onClickPrev(){
      dispatch({
        type: 'transfer/showPreviewWithIndex',
        payload: { index: currentImage - 1 }
      })
    },

    onClickNext(){
      dispatch({
        type: 'transfer/showPreviewWithIndex',
        payload: { index: currentImage + 1 }
      })
    },

    onClose(){
      dispatch({
        type: 'transfer/hidePreview',
      })
    },

    onClickThumbnail(index){
      dispatch({
        type: 'transfer/showPreviewWithIndex',
        payload: {
          index
        }
      })
    },
  }

  let masterForm; // 引用纯组件

  const masterProps = {
    master,
    transNoTitle,
    changeBoxes(targetKeys, direction, moveKeys){
      dispatch({
        type: 'transfer/changeBoxes',
        payload: { targetKeys, direction, moveKeys }
      })
      // 判断是否有未满冻存盒
      let chooseEmpty = false
      const unFullBoxes = []
      if (direction === 'right') {
        master.boxes.list.filter(x => {
          return lodash.includes(moveKeys, x.boxCode + '')  // 已选中的 box 对象
        }).forEach(x => {
          if (x.total !== '100') {
            master.boxes.notFullBoxes.push(x.boxCode)
            chooseEmpty = true
            unFullBoxes.push(x.boxCode);
          }
        })

        if (chooseEmpty) {
          Modal.warning({
            title: '注意,您选择了未满的冻存盒!',
            content: unFullBoxes.join(" "),
            // onCancel() {
            //   dispatch({
            //     type: 'transfer/unSelectNotFullBoxes',
            //     payload: { unFullBoxes }
            //   })
            // }
          })
        }
      }
    },
    changeTransNoDisabled(){
      dispatch({
        type: 'transfer/changeTransNo'
      })
    },
    changeCreateByDisabled() {
      dispatch({
        type: 'transfer/changeCreateBy'
      })
    },
    searchRcc(v) {
      dispatch({
        type: 'transfer/queryRccs',
        payload: {
          s: 'ac3',
          q: v
        }
      })
    },
    selectRcc(v) {
      dispatch({
        type: 'transfer/createTransNo',
        payload: {
          rccCode: v
        }
      })
      dispatch({
        type: 'transfer/queryBoxes',
        payload: {
          rccCode: v
        }
      })
    },
    searchUser(v) {
      dispatch({
        type: 'transfer/queryUsers',
        payload: {
          s: 'ac1',
          q: v
        }
      })
    },
    changeTitle(dateStr) {
      dispatch({
        type: 'transfer/changeTitle',
        payload: {
          dateStr
        }
      })
    },
    selectDate(date, dateStr) {
      dispatch({
        type: 'transfer/createTransNo',
        payload: {
          dateStr
        }
      })
    },
    showEmailModal(item) {
      dispatch({
        type: 'transfer/showEmailModal',
        payload: {
          item
        }
      })
    },
    //
    showPreviewModal(data) {
      dispatch({
        type: 'transfer/showPreviewModal',
        payload: data
      })
    },

    resetForm() {
      dispatch({
        type: 'transfer/resetForm'
      })
    }
  }

  const modalProps = {
    modalItem,
    title: modalItem.title,
    visible: modalVisible,
    maskClosable: false,
    wrapClassName: 'vertical-center-modal',
    onOk (data) {
      dispatch({
        type: `transfer/createOrUpdateTransEmail`,
        payload: data,
      })
    },
    onCancel() {
      dispatch({
        type: 'transfer/hideEmailModal',
      })
    }
  }

  const previewModalProps = {
    master,
    title: '转运指令确认',
    visible: previewModalVisible,
    maskClosable: false,
    width: 750,
    wrapClassName: 'vertical-center-modal',
    onOk (data) {
      dispatch({
        type: `transfer/createTransfer`,
      })
      masterForm.resetFields()
    },
    onCancel() {
      dispatch({
        type: 'transfer/hidePreviewModal',
        payload: {
          isSuccess: false // 关闭 modal，非保存
        }
      })
    }
  }

  return (
    <div className="content-inner">
      <Tabs defaultActiveKey="1">
        <TabPane tab={<span><Icon type="bars" />详情</span>} key="1">
          <Filter {...filterProps} />
          <List {...listProps} />
          <Lightbox {...previewProps} />
        </TabPane>
        <TabPane tab={<span><Icon type="edit" />新增</span>} key="2">
          <Master {...masterProps} ref={el => masterForm = el} />
          {modalVisible && <MasterEmailModal {...modalProps} />}
          {previewModalVisible && <PreviewModal {...previewModalProps} />}
        </TabPane>
      </Tabs>
    </div>
  )
}

SpemTransfer.propTypes = {
  location: PropTypes.object,
  dispatch: PropTypes.func,
  loading: PropTypes.object,
}

export default connect(({ transfer, loading }) => ({ transfer, loading }))(SpemTransfer)
