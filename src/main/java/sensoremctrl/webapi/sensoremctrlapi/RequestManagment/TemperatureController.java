package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sensoremctrl.webapi.sensoremctrlapi.Model.TemperatureRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.TemperatureLogg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TemperatureController {

    private TemperatureRepository temperatureRepository;

    @Autowired
    public TemperatureController(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    @RequestMapping(value = "/temperatures", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TemperatureLogg> getTemperatures() {
        return temperatureRepository.findAll();
    }
}
