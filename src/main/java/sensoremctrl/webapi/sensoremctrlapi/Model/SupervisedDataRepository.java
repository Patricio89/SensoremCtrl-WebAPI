package sensoremctrl.webapi.sensoremctrlapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.webapi.sensoremctrlapi.Table.SupervisedData;

import java.util.List;

public interface SupervisedDataRepository extends JpaRepository<SupervisedData, Long> {

    List<SupervisedData> findByEmail(String email);
}
