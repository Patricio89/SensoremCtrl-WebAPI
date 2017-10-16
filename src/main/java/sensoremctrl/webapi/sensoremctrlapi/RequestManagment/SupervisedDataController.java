package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.webapi.sensoremctrlapi.Model.SupervisedDataRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.SupervisedData;

@RestController
public class SupervisedDataController {

    @Autowired
    SupervisedDataRepository repository;

    private SupervisedData supervisedData;


//    @RequestMapping(value = "/api/ControllValues", method = RequestMethod.PUT)
//    public void saveTemperature(int temperature){
//        int controllTemperature = supervisedData.setTemperature(temperature);
//        return controllTemperature;
//
//
//    }

    @RequestMapping(value = "/api/ControllValues", method = RequestMethod.POST)
    public void saveDataForNewUser(String email, int temperature, int humidity){
        SupervisedData newData = new SupervisedData(email, temperature, humidity);

        repository.save(newData);
    }

    //Update table on email, however table needs to be reworked with ID for long in order to be found.
//    @RequestMapping(value = "/api/ControllValues", method = RequestMethod.PUT)
//    public void saveDataValuesToSupervise(String email, int temperature, int humidity){
//
//
//
//        SupervisedData modifyDataControllByEmail = new SupervisedData(temperature, humidity);
//
//        repository.save(modifyDataControllByEmail);
//    }



}
