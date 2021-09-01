# Aug_batch
## Day_7 Eureka集群+负载均衡的版本配置
Eureka3.x版本之后不再集成Ribbon, 而SpringCloud 2020.x 更新了自己的LoadBalancer.

因此想正常使用IRule接口调用Ribbon方法需要使用老版本的Eureka和SpringCloud, 因为SpringCould的版本和SpringBoot的版本是关联的，所以需要使用对应的SpringBoot版本.

- JDK1.8(或者8)
- spring-boot-starter-parent：2.3.12.RELEASE
- spring-cloud-dependencies：Hoxton.SR12

- eureka注册中心(集群)：spring-cloud-starter-netflix-eureka-server：2.2.2.RELEASE

- 服务提供者和服务消费者都要导入：spring-cloud-starter-netflix-eureka-client：2.2.2.RELEASE（提供服务，访问服务，关联注册中心）

- 服务消费者+ribbon:spring-cloud-starter-netflix-eureka-client：2.2.2.RELEASE 这个包内包含了ribbon（负载均衡）

- 服务消费者+feign:spring-cloud-starter-openfeign:2.2.2.RELEASE（负载均衡）

- 服务消费者+Hystrix:spring-cloud-starter-netflix-hystrix 2.2.2.RELEASE（熔断和降级）
