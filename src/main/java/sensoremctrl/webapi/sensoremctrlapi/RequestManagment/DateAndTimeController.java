package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.webapi.sensoremctrlapi.Model.DateAndTimeRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.DateAndTimeLogg;

import java.util.List;

@RestController
@RequestMapping(value = "/api/timestamp")
public class DateAndTimeController {

    @Autowired
    private DateAndTimeRepository dateAndTimeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<DateAndTimeLogg> getDateAndTime() {
        return dateAndTimeRepository.findAll();
    }
}
