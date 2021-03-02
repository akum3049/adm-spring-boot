package com.cts.product.entity;

import java.time.LocalDate;

public class Order {

	private int orderId;
	private LocalDate orderDate;
	private String userId;
	private double orderAmount;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, LocalDate orderDate, String userId, double orderAmount) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.userId = userId;
		this.orderAmount = orderAmount;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

}
