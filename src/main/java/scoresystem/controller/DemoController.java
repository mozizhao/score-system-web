package scoresystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scoresystem.service.DemoService;

/**
 * Created by xavimo on 2018/1/10.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    public String demo() {
        return "hello!!!";
    }

    @RequestMapping("/demo/{name}")
    public String dubbodemo(@PathVariable("name")String name) {
        return demoService.demo(name);
    }
}
