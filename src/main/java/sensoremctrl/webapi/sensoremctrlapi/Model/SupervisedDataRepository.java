package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sensoremctrl.webapi.sensoremctrlapi.Table.SupervisedData;

@Repository
public interface SupervisedDataRepository extends JpaRepository<SupervisedData, Long> {
}
