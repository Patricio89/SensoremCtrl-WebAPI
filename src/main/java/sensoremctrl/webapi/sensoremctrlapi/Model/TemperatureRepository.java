package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sensoremctrl.webapi.sensoremctrlapi.Table.TemperatureLogg;

import java.util.List;


public interface TemperatureRepository extends JpaRepository<TemperatureLogg, Long> {


}
