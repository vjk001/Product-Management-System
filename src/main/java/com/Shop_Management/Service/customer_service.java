package com.Shop_Management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shop_Management.Dao.customer_dao;
import com.Shop_Management.Entity.customer;

@Service
public class customer_service {

	@Autowired
	customer_dao dao;

	public customer getdata(int id) {

		return dao.getcustomer(id);

	}

}
