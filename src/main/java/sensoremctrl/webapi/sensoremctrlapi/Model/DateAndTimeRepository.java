package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sensoremctrl.webapi.sensoremctrlapi.Table.DateAndTimeLogg;

@Repository
public interface DateAndTimeRepository extends JpaRepository<DateAndTimeLogg, Long> {
}
