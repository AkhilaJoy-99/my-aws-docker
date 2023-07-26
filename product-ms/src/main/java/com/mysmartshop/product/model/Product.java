package com.mysmartshop.product.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	private String productId;
	private String name;
	private float price;
	private String description;

}


//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Data
//public class Product {
//	@Id
//	private String productId;
//	private String name;
//	private float price;
//	private String description;
//
//}
