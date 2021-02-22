package com.cts.flight;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.flight.dao.FlightDao;
import com.cts.flight.entity.Flight;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		FlightDao flightDao = ac.getBean(FlightDao.class);

		Flight flight = flightDao.findById(1).orElse(null);
		
		if(flight!=null) {
			System.out.println(flight.getId());
			System.out.println(flight.getFlightNumber());
			System.out.println(flight.getOrigin());
			System.out.println(flight.getDestination());
			System.out.println(flight.getFlightDate());
			System.out.println(flight.getFlightTime());
			System.out.println(flight.getDuration());
			
			System.out.println("Ticket Fare: "+flight.getFare().getFare());
			System.out.println("Avaible seats as of "+LocalDateTime.now()+" are: "+flight.getInventory().getCount());
			System.out.println("Airlines: "+flight.getFlightInfo().getAirlineInfo().getAirlineName());
			
			
		}

	}

}
