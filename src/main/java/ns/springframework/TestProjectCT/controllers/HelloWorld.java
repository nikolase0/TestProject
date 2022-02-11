package ns.springframework.TestProjectCT.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/string")
    public String sayHello(){

        return "Hello World!";
    }
}
