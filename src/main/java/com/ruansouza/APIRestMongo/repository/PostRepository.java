package com.ruansouza.APIRestMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ruansouza.APIRestMongo.domain.Post;
import com.ruansouza.APIRestMongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
}
