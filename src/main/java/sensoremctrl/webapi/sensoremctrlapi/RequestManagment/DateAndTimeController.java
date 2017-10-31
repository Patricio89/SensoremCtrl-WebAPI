package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sensoremctrl.webapi.sensoremctrlapi.Model.DateAndTimeRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.DateAndTimeLogg;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DateAndTimeController {

    private DateAndTimeRepository dateAndTimeRepository;

    @Autowired
    public DateAndTimeController(DateAndTimeRepository dateAndTimeRepository) {
        this.dateAndTimeRepository = dateAndTimeRepository;
    }

    @RequestMapping(value = "/timestamps", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    //@CrossOrigin
    public List<DateAndTimeLogg> getDateAndTime() {
        return dateAndTimeRepository.findAll();
    }
}
