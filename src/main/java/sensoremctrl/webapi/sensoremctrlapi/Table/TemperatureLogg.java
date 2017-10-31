package sensoremctrl.webapi.sensoremctrlapi.Table;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "temperaturelogg")
public class TemperatureLogg implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "temperatureid")
        private int temperatureId;

        @Column(name = "temperature")
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

}

