package com.mysmartshopt.order.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	@Id
    @JsonProperty("id")
    private int _id;
    private String orderId;
    private List<CartItem> orderItems;
    private String status;

}
