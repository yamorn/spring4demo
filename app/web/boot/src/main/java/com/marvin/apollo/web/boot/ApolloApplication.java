package com.marvin.apollo.web.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author hufeng
 * @version ApolloApplication.java, v 0.1 2019-01-11 01:55 Exp $
 */
@PropertySources({
        @PropertySource("classpath:dal.properties"),
        @PropertySource("classpath:application.properties")

})
@SpringBootApplication(scanBasePackages = "com.marvin.apollo")
public class ApolloApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApolloApplication.class, args);
    }
}
