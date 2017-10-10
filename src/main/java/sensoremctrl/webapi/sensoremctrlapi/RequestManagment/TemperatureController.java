package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.webapi.sensoremctrlapi.Model.TemperatureRepository;


@RestController
@RequestMapping(value = "/api/temperature")
public class TemperatureController {

    @Autowired
    private TemperatureRepository temperatureRepository;

}
