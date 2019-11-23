package info.xpanda.labs.mesh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WebController {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "i'm web";
    }

    @RequestMapping("/findService")
    @ResponseBody
    public String findService(){
        return restTemplate.getForObject("", String.class);
    }
}
