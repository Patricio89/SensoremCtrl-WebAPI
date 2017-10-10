package sensoremctrl.webapi.sensoremctrlapi.Table;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "humiditylog")
public class HumidityLogg implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long humidityID;
    private int humidity;

    protected HumidityLogg(){

    }

    public HumidityLogg(int humidity) {
        this.humidity = humidity;
    }

    public long getHumidityID() {
        return humidityID;
    }

    public void setHumidityID(long humidityID) {
        this.humidityID = humidityID;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "HumidityLogg{" +
                "humidity=" + humidity +
                '}';
    }
}
