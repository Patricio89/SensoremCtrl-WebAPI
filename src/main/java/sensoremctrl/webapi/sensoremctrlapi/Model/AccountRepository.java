package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
