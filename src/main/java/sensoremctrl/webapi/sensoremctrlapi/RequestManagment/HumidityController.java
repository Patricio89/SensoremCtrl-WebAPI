package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.webapi.sensoremctrlapi.Model.HumidityRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.HumidityLogg;

import java.util.List;

@RestController
@RequestMapping(value = "/api/humidity")
public class HumidityController {

    @Autowired
    private HumidityRepository humidityRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<HumidityLogg> getHumidities() {
        return humidityRepository.findAll();
    }

}
