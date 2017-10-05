package sensoremctrl.webapi.sensoremctrlapi.RequestManagment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.webapi.sensoremctrlapi.Model.AccountRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.Account;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository repository;


    @RequestMapping(value = "register", method = RequestMethod.POST)
    public void createNewUser(String firstName, String lastName, String email, String userPassword, boolean admin){
        Account user = new Account(firstName, lastName, email, userPassword, true);
        repository.save(user);
    }



}
