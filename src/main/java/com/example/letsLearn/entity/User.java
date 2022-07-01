package com.example.letsLearn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "user")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "document_id")
	private String document_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone_number")
	private String phone_number;
	
	@Column(name = "email")
	private String email;
	
}
