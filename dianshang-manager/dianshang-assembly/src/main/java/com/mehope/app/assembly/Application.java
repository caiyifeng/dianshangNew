package com.mehope.app.assembly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Hello world!
 *
 */

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@MapperScan("com.mehope.app.dianshang.mapper")
@ComponentScan("com.mehope.app.dianshang")
public class Application 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(Application.class, args);
    }
}
