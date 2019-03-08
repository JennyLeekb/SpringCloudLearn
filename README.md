# SpringCloudLearn
SpringCloud 学习记录

服务提供者 user
服务消费者 consumer

1. sts可以快速创建SpringBoot工程

2. SpringBoot Actuator 提供很多监控端点，可以监控服务状态


3. Eureka是一个服务发现组件。微服务可以注册到Eureka上，相当于一个注册中心。
Eureka Server / Eureka Server（引用时注意版本）

4. Eureka的高可用可以通过Eureka集群来实现

5. 为Eureka添加用户认证可以使用 spring-boot-starter-security

6. 修改Eureka元数据只需要在application.xml中添加
Eureka.instance.metadata-map.my-metadata=我自定义的数据

7. Eureka有自我保护模式。当Eureka service 节点在短时间内丢失过多客户端，那么这个节点就会进入自我保护模式

8. Ribbon 是一个负载均衡器。可以基于负载均衡算法，自动帮助服务消费者去请求。（就相当于调控）
