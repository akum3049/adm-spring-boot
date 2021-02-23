package com.cts.flight.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.FetchType;

import org.hibernate.annotations.Fetch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.data.repository.query.Param;

import com.cts.flight.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Integer> {

	// DSL
	Flight findFlightByFlightNumber(String lightNumber);
	List<Flight> findFlightByFlightDate(LocalDate flightDate);
	//List<Flight> findFlightByFlightDateAnd
	List<Flight> findFlightByOriginAndDestinationAndFlightDate(String orgin,String destination,LocalDate flightDate);
	
	// Using Query annotations
	
	
	
	// Find All Flights
	@Query(value = "from Flight")
	List<Flight> listAllFlights();
	
	// Find All Flights
	@Query(value = "select * from flight",nativeQuery = true)
	List<Flight> listAllFlightsV1();
	
	// List all Flights Whose price is <= 5000
	@Query("from Flight as f where f.fare.fare <= 5000")
	List<Flight> filterFlightsByPrice();
	
	
	//@Query("from Flight as f where f.fare.fare >= :price")
	//List<Flight> filterFlightsByPriceV1(double price);
	
	@Query("from Flight as f where f.fare.fare >= :myprice")
    List<Flight> filterFlightsByPriceV1(@Param("myprice") double price);
	
	
	
	
	
	
	

}
