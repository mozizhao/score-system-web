package scoresystem.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import scoresystem.service.DemoService;

/**
 * Created by xavimo on 2018/1/10.
 */
public class DemoMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo/dubbo-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        DemoService demoService = (DemoService) context.getBean("demoService");
        // execute remote invocation
        String hello = demoService.demo("world");
        // show the result
        System.out.println(hello);
    }
}
