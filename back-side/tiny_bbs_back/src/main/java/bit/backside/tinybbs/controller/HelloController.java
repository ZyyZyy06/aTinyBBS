package bit.backside.tinybbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name){
        System.out.println("hello" + name);
        return "hello" + name;
    }
}
