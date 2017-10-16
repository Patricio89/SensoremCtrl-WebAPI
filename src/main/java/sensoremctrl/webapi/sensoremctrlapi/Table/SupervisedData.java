package sensoremctrl.webapi.sensoremctrlapi.Table;

import javax.persistence.*;

@Entity
@Table(name = "SupervisedData")
public class SupervisedData {

    @Id
    private String email;

    private int temperature;
    private int humidity;

    public SupervisedData(String email, int temperature, int humidity) {
        this.email = email;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public SupervisedData(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}
