package ns.springframework.TestProjectCT.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloIndex {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
