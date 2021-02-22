package com.cts.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.flight.dao.FlightInfoDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ApplicationContext ac=	SpringApplication.run(Application.class, args);
	FlightInfoDao dao = ac.getBean(FlightInfoDao.class);
	 
	 
	 dao.findAll().forEach(ai->{
		 System.out.println(ai.getAirlineId());
		 System.out.println(ai.getAirlineLogo());
		 System.out.println(ai.getAirlineName());
		 System.out.println("--------------------------");
	 });
	}

}
