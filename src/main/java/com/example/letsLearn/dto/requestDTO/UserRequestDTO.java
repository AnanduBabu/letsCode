package com.example.letsLearn.dto.requestDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {

	private String document_id;
	
	private String name;
	
	private String phone_number;
	
	private String email;
	
	
}
