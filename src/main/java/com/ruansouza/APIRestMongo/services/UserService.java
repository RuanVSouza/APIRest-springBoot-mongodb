package com.ruansouza.APIRestMongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruansouza.APIRestMongo.domain.User;
import com.ruansouza.APIRestMongo.dto.UserDTO;
import com.ruansouza.APIRestMongo.repository.UserRepository;
import com.ruansouza.APIRestMongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User inser(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		repo.findById(id);
		repo.deleteById(id);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
}
