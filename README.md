# gmall2

[TOC]

> 电商项目学习工程,项目集成版本适配
> 1. `SpringBoot 2.7.x | 2.6.x` 适配 `Spring Cloud 2021.0.x aka Jubilee`
> 2. `Spring Boot 2.6.x` 适配 `Spring Cloud Alibaba 2021.x 版本`
>
> 本项目使用 `Spring Boot 2.7.1` + `Spring Cloud 2021.0.5` + `Spring Cloud Alibaba 2021.0.4.0`

## 一、模块说明

> 1. `gmall-common` : 公共模块
> 2. `gmall-coupon` : 票券模块
> 3. `gmall-member` : 会员模块
> 4. `gmall-order` : 订单模块
> 5. `gmall-product` : 产品模块
> 6. `gmall-ware` : 采购模块
> 7. `renren-fast` : 人人开源后台管理系统
> 8. `renren-generator` : 人人开源后端代码逆向工程

## 二、单个服务使用架构

> 单个功能模块服务使用 `SpringBoot 2.7.1 + MyBatis-Plus 3.5.2 + MySQL`

## 三、微服务架构

> 该项目使用 `SpringCloud Alibaba` 微服务解决方案,使用如下组件:
> 1. `SpringCloud Alibaba Nacos` : 注册中心(服务发现/注册)
> 2. `SpringCloud Alibaba Nacos` : 配置中心(动态配置管理)
> 3. `SpringCloud Ribbon` : 负责均衡
> 4. `SpringCloud OpenFeign` : 声明式 `HTTP` 客户端(远程调用服务)
> 5. `SpringCloud Alibaba Sentinel` : 服务容错(限流、降级、熔断)
> 6. `SpringCloud Gateway` : `API` 网关( `webflux` 编程模式)
> 7. `SpringCloud Sleuth` : `调用链监控`
> 8. `SpringCloud Alibaba Seata` : (原 `Fescar`),分布式事务解决

## 四、引入 `Spring Cloud Alibaba`

> 在 `gmall-common` 模块的 `pom.xml` 添加如下依赖管理

```xml

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-dependencies</artifactId>
            <version>2021.0.4.0</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

## 五、`Nacos` 服务注册中心
> [参见文档 README_Nacos_Discovery.md](./README_Nacos_Discovery.md)

## 六、`OpenFeign` 远程调用
> [参见文档 README_OpenFeign.md](README_OpenFeign.md)

## 七、 `Nacos` 配置中心
> [参见文档 README_Nacos_Config.md](./README_Nacos_Config.md)

## 八、 `Gateway` 网关
> [参见文档 README_Gateway.md](./README_Gateway.md)
