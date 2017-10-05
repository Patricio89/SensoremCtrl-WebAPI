package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.webapi.sensoremctrlapi.Model.HumidityRepository;

@RestController
@RequestMapping(value = "/humidity")
public class HumidityController {

    @Autowired
    private HumidityRepository humidityRepository;



}
