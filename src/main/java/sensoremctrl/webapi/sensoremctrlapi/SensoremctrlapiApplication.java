package sensoremctrl.webapi.sensoremctrlapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class SensoremctrlapiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SensoremctrlapiApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SensoremctrlapiApplication.class, args);
	}


}
