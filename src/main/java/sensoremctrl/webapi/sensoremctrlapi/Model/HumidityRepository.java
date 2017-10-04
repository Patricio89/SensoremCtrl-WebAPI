package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.HumidityLogg;

public interface HumidityRepository extends JpaRepository<HumidityLogg, Long> {
}
