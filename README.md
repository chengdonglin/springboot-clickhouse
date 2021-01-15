# springboot-clickhouse

    springboot整合mybatis访问clickhouse

# pom.xml

```  
           <dependencies>
                   <dependency>
                       <groupId>org.springframework.boot</groupId>
                       <artifactId>spring-boot-starter-web</artifactId>
                   </dependency>
                   <dependency>
                       <groupId>org.springframework.boot</groupId>
                       <artifactId>spring-boot-starter-jdbc</artifactId>
                   </dependency>
                   <dependency>
                       <groupId>org.mybatis.spring.boot</groupId>
                       <artifactId>mybatis-spring-boot-starter</artifactId>
                       <version>2.0.0</version>
                   </dependency>
                   <dependency>
                       <groupId>ru.yandex.clickhouse</groupId>
                       <artifactId>clickhouse-jdbc</artifactId>
                       <version>0.2.4</version>
                   </dependency>
                   <dependency>
                       <groupId>org.projectlombok</groupId>
                       <artifactId>lombok</artifactId>
                   </dependency>
               </dependencies>
```

# application.yml

    spring:
      datasource:
        driver-class-name: ru.yandex.clickhouse.ClickHouseDriver
        url: jdbc:clickhouse://192.168.10.203:8123/test1
      application:
        name: clickouse-application
    mybatis:
      mapper-locations: classpath:mapper/*.xml
      configuration:
        map-underscore-to-camel-case: true
        log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
    server:
      port: 9000
