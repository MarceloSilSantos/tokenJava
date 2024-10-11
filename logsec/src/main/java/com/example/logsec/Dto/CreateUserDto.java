package com.example.logsec.Dto;


import com.example.logsec.Enums.RoleName;

public record CreateUserDto(
		String email,
		String password,
		RoleName role
		
		) {

}
