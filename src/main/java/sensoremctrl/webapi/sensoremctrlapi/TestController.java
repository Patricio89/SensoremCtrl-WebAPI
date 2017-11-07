package sensoremctrl.webapi.sensoremctrlapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }
}
