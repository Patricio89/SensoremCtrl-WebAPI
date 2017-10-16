package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sensoremctrl.webapi.sensoremctrlapi.Table.HumidityLogg;

@Repository
public interface HumidityRepository extends JpaRepository<HumidityLogg, Long> {
}
