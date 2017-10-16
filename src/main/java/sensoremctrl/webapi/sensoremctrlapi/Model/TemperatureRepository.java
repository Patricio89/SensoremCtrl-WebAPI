package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sensoremctrl.webapi.sensoremctrlapi.Table.TemperatureLogg;

@Repository
public interface TemperatureRepository extends JpaRepository<TemperatureLogg, Integer> {
}
