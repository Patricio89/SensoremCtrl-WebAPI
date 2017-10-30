package sensoremctrl.webapi.sensoremctrlapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "sensoremctrl.webapi.sensoremctrlapi")
@EnableJpaRepositories(basePackages = "sensoremctrl.webapi.sensoremctrlapi.Model")
@EntityScan(basePackages = "sensoremctrl.webapi.sensoremctrlapi.Table")
public class SensoremctrlapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensoremctrlapiApplication.class, args);
	}

	//push attempt.
}
