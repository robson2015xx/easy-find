package com.rtech.easyfind.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rtech.easyfind.model.entity.UserEntity;
import com.rtech.easyfind.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

	@Override
	public ResponseEntity<UserEntity> createUser() {

		UserEntity user = new UserEntity();
		log.info("@App=> Criando usuario");
		
		return ResponseEntity.ok(user);
	}
}
