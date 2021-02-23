package com.cts.flight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.flight.dao.AirlineDao;
import com.cts.flight.dao.FlightDao;
import com.cts.flight.entity.AirlineInfo;
import com.cts.flight.entity.Flight;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		FlightDao flightDao = ac.getBean(FlightDao.class);
		AirlineDao airlineInfoDao = ac.getBean(AirlineDao.class);

		/*
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
		
		*/
		
		
		/*
		
		// List all schedules flights of Airindia
		
		
		AirlineInfo ai = airlineInfoDao.findById(21).orElse(null);
		
		 System.out.println("ID: "+ai.getAirlineId());
		 System.out.println("Airlines name: "+ai.getAirlineName());
		 System.out.println("Logo: "+ai.getAirlineLogo());
		 
		 ai.getFlightsInfo().forEach(flightInfo->{
			 System.out.println("FLightInfo ID: "+flightInfo.getFlightInfoid());
			 System.out.println("Flight Number: "+flightInfo.getFlightNumber());
			 System.out.println("Flight Type: "+flightInfo.getFlightType());
			 System.out.println("Max Seating Capacity: "+flightInfo.getSeatCapacity());
			 System.out.println("Airline Name: "+flightInfo.getAirlineInfo().getAirlineName());
			 System.out.println("-------------------------------------------------------------------");
			 
		 });
		
		*/
		
		
		/*
		
		Flight flight = flightDao.findFlightByFlightNumber("AI-840");
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
		
		*/
		
		/*
		flightDao.findFlightByFlightDate(LocalDate.of(2021, 02, 26)).forEach(flight->{
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
			System.out.println("------------------------------");
		});
		
	*/
		
		
		/*
		
		// List all flights flying from Delhi to Chennai on 26th of Feb 2021 with number of passengers
		
		
		List<Flight> flights=flightDao.findFlightByOriginAndDestinationAndFlightDate("DELHI", "CHENNAI", LocalDate.of(2021, 02, 26));
		
		System.out.println("Before Filter: "+ flights.size());
		
		flights=flights.stream().filter(flight->flight.getInventory().getCount()>=21).collect(Collectors.toList());
		
		System.out.println("After Filter: "+ flights.size());

		
		flights.forEach(flight->{
			
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
				System.out.println("------------------------------");
		});
		
		*/
		
		flightDao.filterFlightsByPriceV1(6000).forEach(flight->{

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
			System.out.println("------------------------------");
		});
		
		

	}

}
