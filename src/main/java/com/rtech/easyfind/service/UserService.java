package com.rtech.easyfind.service;

import org.springframework.http.ResponseEntity;

import com.rtech.easyfind.model.entity.UserEntity;

public interface UserService {

	ResponseEntity<UserEntity> createUser();
}
