package com.Shop_Management.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class customer {

	@Id
	int customer_id;
	String customer_name;
	String customer_city;
	int product_id;
	int order_id;

	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public customer(int customer_id, String customer_name, String customer_city, int product_id, int order_id) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_city = customer_city;
		this.product_id = product_id;
		this.order_id = order_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_city() {
		return customer_city;
	}

	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	@Override
	public String toString() {
		return "customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_city="
				+ customer_city + ", product_id=" + product_id + "]";
	}

}
