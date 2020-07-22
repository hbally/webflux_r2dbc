# webflux_r2dbc
响应式数据库


# docker 构建 push到私服

- 工具
```$xslt
  docker-maven-plugin 构建工具
 
  1.直接maven 构建 
  2.通过Dockerfile
  
  Harbor 镜像管理中心 
```

- 配置

```$xslt
  
  maven settings.xml 添加
  
  <server>
         <id>harbor-docker-registry</id>
         <username>admin</username>
         <password>123456</password>
         <configuration>
           <email>hbally@126.com</email>
         </configuration>
   </server>
   
   pom.xml
   
   <registryUrl>192.168.8.20:9090</registryUrl>
   <serverId>harbor-docker-registry</serverId>
```