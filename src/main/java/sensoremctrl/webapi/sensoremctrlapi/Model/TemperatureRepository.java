package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.TemperatureLogg;

public interface TemperatureRepository extends JpaRepository<TemperatureLogg, Long> {
}
