package com.jpa.test.entity;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
