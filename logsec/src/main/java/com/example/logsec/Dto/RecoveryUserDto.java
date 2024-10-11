package com.example.logsec.Dto;

import java.util.List;

import com.example.logsec.model.Role;

public record RecoveryUserDto(
		Long Id,
		String email,
		List<Role> roles
		) {

}
