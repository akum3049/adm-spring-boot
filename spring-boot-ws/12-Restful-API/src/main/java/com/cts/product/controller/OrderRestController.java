package com.cts.product.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Order;

@RestController
@CrossOrigin
@RequestMapping("/api/orders")
public class OrderRestController {

	List<Order> orders = null;

	public OrderRestController() {

		Order o1 = new Order(10, LocalDate.of(2021, 02, 12), "User1", 8383);
		Order o2 = new Order(11, LocalDate.of(2021, 01, 19), "User2", 9347);
		Order o3 = new Order(12, LocalDate.of(2021, 02, 12), "User1", 2453);
		Order o4 = new Order(13, LocalDate.of(2021, 03, 01), "User2", 5537);
		Order o5 = new Order(14, LocalDate.of(2021, 02, 12), "User5", 6874);
		orders = new ArrayList<>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		orders.add(o4);
		orders.add(o5);

	}

	// save order using get method
	@GetMapping("/save/{orderId}/{orderDate}/{userId}/{orderAmount}")
	public Order saveOrder(
			@PathVariable int orderId, 
			@PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate orderDate,
			@PathVariable String userId, 
			@PathVariable double orderAmount) {
		Order newOrder = new Order(orderId, orderDate, userId, orderAmount);
		
		orders.add(newOrder);

		return newOrder;
	}
	
	
	// save new Order using post mapping
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE} )
	public Order save(@RequestBody Order newOrder) {
		orders.add(newOrder);
		return newOrder;
	}

	// List all Orders
	@GetMapping
	public List<Order> listAllOrders() {
		return orders;
	}

	@GetMapping("/date/{orderDate}")
	public List<Order> orderDetails(@PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate orderDate) {
		return orders.stream().filter(order -> order.getOrderDate().equals(orderDate)).collect(Collectors.toList());
	}

	// Send Order details for a given order Number
	@GetMapping("/{orderId}")
	public ResponseEntity<Object> orderDetails(@PathVariable int orderId) {

		for (Order order : orders) {
			if (order.getOrderId() == orderId) {
				return new ResponseEntity<Object>(order, HttpStatus.OK);
			}
		}

		return new ResponseEntity<Object>("Order id " + orderId + " not found", HttpStatus.NOT_FOUND);

	}

	// find all orders by user name

	@GetMapping("/user/{userName}")
	public List<Order> findOrdersByuserId(@PathVariable String userName) {
		return orders.stream().filter(order -> order.getUserId().equals(userName)).collect(Collectors.toList());

	}

}
