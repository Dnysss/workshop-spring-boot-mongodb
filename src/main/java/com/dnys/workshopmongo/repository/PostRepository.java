package com.dnys.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dnys.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
	
}
