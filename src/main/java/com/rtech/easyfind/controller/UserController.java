package com.rtech.easyfind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rtech.easyfind.model.entity.UserEntity;
import com.rtech.easyfind.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;

	@PostMapping
	public ResponseEntity<UserEntity> createUser(){
		return service.createUser();
	}
}
