package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {

    @RequestMapping("/")
    public String index() {
        return "Test av api";
    }
}
