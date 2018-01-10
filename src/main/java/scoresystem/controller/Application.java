package scoresystem.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by xavimo on 2018/1/9.
 */
@ImportResource({"classpath:dubbo/dubbo-consumer.xml"})
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
