package sensoremctrl.webapi.sensoremctrlapi.Table;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "temperaturelog")
public class TemperatureLogg implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int temperatureId;
        private int temperature;


        protected TemperatureLogg(){
        }

        public TemperatureLogg(int temperature) {
            this.temperature = temperature;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public int getTemperatureId() {
            return temperatureId;
        }

        public void setTemperatureId(int temperatureId) {
            this.temperatureId = temperatureId;
        }

    @Override
    public String toString() {
        return "TemperatureLogg{" +
                "temperature=" + temperature +
                '}';
    }
}

