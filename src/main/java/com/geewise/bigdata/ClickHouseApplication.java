package com.geewise.bigdata;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author linchengdong
 * @created 2021-01-13 9:02
 */
@SpringBootApplication
@MapperScan("com.geewise.bigdata.mapper")
@Slf4j
public class ClickHouseApplication {
    public static void main(String[] args) {
        log.info("clickhouse 应用程序启动成功");
        SpringApplication.run(ClickHouseApplication.class,args);
    }
}

