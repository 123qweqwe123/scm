package com.jet.scm.web.sys.qo;

/**
 * Description:
 * <pre>
 *     封装 Tree 拖拽排序参数
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/31 下午6:42
 */
public class TreeSortQO {

    private String dropKey;
    private String dragKey;
    private int dropPosition;

    public String getDropKey() {
        return dropKey;
    }

    public void setDropKey(String dropKey) {
        this.dropKey = dropKey;
    }

    public String getDragKey() {
        return dragKey;
    }

    public void setDragKey(String dragKey) {
        this.dragKey = dragKey;
    }

    public int getDropPosition() {
        return dropPosition;
    }

    public void setDropPosition(int dropPosition) {
        this.dropPosition = dropPosition;
    }
}
