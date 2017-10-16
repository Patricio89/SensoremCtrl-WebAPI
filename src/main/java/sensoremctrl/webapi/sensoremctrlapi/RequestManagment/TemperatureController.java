package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.webapi.sensoremctrlapi.Model.TemperatureRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.TemperatureLogg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class TemperatureController {

    @Autowired
    private TemperatureRepository temperatureRepository;

    @RequestMapping(value = "/api/temperature",method = RequestMethod.GET)
    public List<TemperatureLogg> getTemperatures() {
        return temperatureRepository.findAll();
    }
}
