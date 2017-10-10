package sensoremctrl.webapi.sensoremctrlapi.Table;

import javax.persistence.*;

@Entity
@Table(name = "SupervisedData")
public class SupervisedData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long supervisedID;

    public long getSupervisedID() {
        return supervisedID;
    }

    public void setSupervisedID(long supervisedID) {
        this.supervisedID = supervisedID;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    private int temperature;
    private int humidity;




}
