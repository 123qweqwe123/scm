
单独运行项目时，使用指定的 profile
`java -jar -Dspring.profiles.active=production demo-0.0.1-SNAPSHOT.war`

## 配置

### 数据库连接池

使用 druid 连接池，目前官方的 [druid-spring-boot-starter](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter) 是快照版本，没有发布到中央库，所以需要本地编译安装。
已发布到 nexus。

引入 `spring-boot-starter-cache` 是为了引入 `spring-context-support`， [参见](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#_supported_cache_providers)

## 环境

### 测试环境

10.24.10.174:8080   测试环境信息
http://www.jt-biobank.com/login 外网地址

### 生产环境

应用：10.24.10.33
数据库: 10.24.10.34 scm/ncrc@2017