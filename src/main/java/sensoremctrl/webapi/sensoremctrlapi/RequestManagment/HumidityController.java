package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sensoremctrl.webapi.sensoremctrlapi.Model.HumidityRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.HumidityLogg;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HumidityController {

    private HumidityRepository humidityRepository;

    @Autowired
    public HumidityController(HumidityRepository humidityRepository) {
        this.humidityRepository = humidityRepository;
    }

    @RequestMapping(value = "/humidities", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin
    public List<HumidityLogg> getHumidities() {
        return humidityRepository.findAll();
    }

}
