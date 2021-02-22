package com.cts.flight;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.flight.dao.AirlineInfoDaoImpl;
import com.cts.flight.entity.AirlineInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		AirlineInfoDaoImpl dao = ac.getBean(AirlineInfoDaoImpl.class);

		/*
		List<AirlineInfo> airLines = dao.listAllAirlines();
		
		for (AirlineInfo airLine : airLines) {
			System.out.println(airLine.getAirlineId());
			System.out.println(airLine.getAirlineName());
			System.out.println(airLine.getAirlineLogo());
			System.out.println("----------------------------");
		}
		
		
		AirlineInfo airLine = dao.findbyId(389);
		if(airLine!=null) {
		System.out.println(airLine.getAirlineId());
		System.out.println(airLine.getAirlineName());
		System.out.println(airLine.getAirlineLogo());
		System.out.println("----------------------------");
		}else {
		System.out.println("ID doesant exists");
		}
		
	*/
		
		AirlineInfo ai=new AirlineInfo();
		ai.setAirlineLogo("new.logo");
		ai.setAirlineName("Fezzi Airlines");
		dao.save(ai);
		
		
		
		
		
		
	}

}
