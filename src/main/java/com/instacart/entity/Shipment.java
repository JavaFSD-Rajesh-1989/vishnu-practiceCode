package com.instacart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Shipment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer shipId ;
	String trackNo;
	String origin; 
	String destination;
	String status;

}
