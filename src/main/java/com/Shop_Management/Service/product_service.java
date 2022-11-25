package com.Shop_Management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shop_Management.Dao.product_dao;
import com.Shop_Management.Entity.product;

@Service
public class product_service {

	@Autowired
	product_dao dao;

	public product getdata(int id) {

		return dao.getproduct(id);

	}

}
