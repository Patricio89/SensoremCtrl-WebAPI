package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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


    @RequestMapping(value = "/api/ControllValues/{email}", method = RequestMethod.PUT)
    public void updateControllValues(@PathVariable("email") String email){




//        SupervisedData modifyDataControllByEmail = new SupervisedData(temperature, humidity);
//        repository.save(modifyDataControllByEmail);
    }


}
