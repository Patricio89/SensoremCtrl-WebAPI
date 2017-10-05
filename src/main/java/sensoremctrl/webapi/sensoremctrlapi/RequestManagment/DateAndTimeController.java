package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.webapi.sensoremctrlapi.Model.DateAndTimeRepository;

@RestController
@RequestMapping(value = "/timestamp")
public class DateAndTimeController {

    @Autowired
    private DateAndTimeRepository dateAndTimeRepository;

}
