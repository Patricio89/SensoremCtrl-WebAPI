package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index() {
        return "Test av api";
    }
}
