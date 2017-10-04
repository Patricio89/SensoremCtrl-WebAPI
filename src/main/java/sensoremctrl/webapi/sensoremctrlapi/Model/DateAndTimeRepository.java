package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.DateAndTimeLogg;

public interface DateAndTimeRepository extends JpaRepository<DateAndTimeLogg, Long> {
}
