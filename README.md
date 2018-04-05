# 样本转运系统管理端

代码库地址：http://10.24.10.14/jnyl/mpp3/bio-check/scm
测试数据库地址： 10.24.10.225:bdcor5 scm/develop

## 前端(scm-fe)

前端代码通过 [dva](https://github.com/dvajs/dva/blob/master/README_zh-CN.md) + [ant-design](https://ant.design/docs/react/introduce-cn) 构建，dva 是一个轻量级的前端框架，基于 redux、redux-saga 和 react-router@2.x 构建，框架里面使用的一些组件在 ant-design 里面定义。开发之前需要掌握下面的前端知识

### 前端知识

[dva 知识图](https://github.com/dvajs/dva-knowledgemap)  

[dva 基本概念](https://github.com/dvajs/dva-docs/blob/master/v1/zh-cn/concepts.md)

[dva 文档](https://github.com/dvajs/dva-docs/blob/master/v1/zh-cn/getting-started.md)

[Ant Design 官网](https://ant.design/docs/react/introduce-cn)

### 配置

```
# 下载 npm 依赖
npm install

# 初始化项目,创建 index.html
npm run init

# 运行开发环境
npm run dev

# 编译生产代码
npm run build
```


## 后端(scm-server)

后端基于 springboot 构建，重新集成了 shiro，mybatis，mybatis-page-helper，与前端数据交互全部采用 json 的方式，异常统一处理，分页数据集中处理。具体 demo 参见 `SysController`。

### 配置


## 运行部署

### 运行(开发)

1. 通过 `npm run dev` 启动前端项目，访问 http://localhost:8000 进入首页
2. 直接运行 `com.bdcor.scm.Application`，默认端口 7000 在 *application.yml* 里面配置
3. 前端后端通过代理的方式跨域进行数据交互，具体映射见 `scm-fe/.roadhogrc.js` 文件 proxy 配置

### 部署方式

``` bash
cd scm/scm-fe
# 需要注释 scm-fe/src/utils/request.js 第九行
npm run build
# 将编译之后 dist 文件夹内文件全部拷贝到 server 对应目录中
cp -f dist/* scm/scm-server/src/main/resources/static/
```

### 注意事项

1. 使用 mybatis-generator 生成代码时，table 必须使用下划线转驼峰的形式，即 `sys_account` 对应表 `SysAccount`
2. 代码使用 4 个空格代码 tab
3. 代码规范需遵守 [阿里巴巴 JAVA 开发手册](http://www.itxiu.net/u/cms/www/201702/08201931m5uk.pdf)



