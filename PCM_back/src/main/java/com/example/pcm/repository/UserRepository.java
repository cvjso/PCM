package com.example.pcm.repository;

import com.example.pcm.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	public User findByEmail(String lepolepo);

}