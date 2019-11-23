package info.xpanda.labs.mesh.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServiceController {
    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "i'm service";
    }
}
