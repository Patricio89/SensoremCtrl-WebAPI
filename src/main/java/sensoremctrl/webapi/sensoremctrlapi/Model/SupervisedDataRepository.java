package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.SupervisedData;

public interface SupervisedDataRepository extends JpaRepository<SupervisedData, Long> {
}
