package com.dnys.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnys.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User denys = new User("1", "Denys Silva", "denys@gmail.com");
		User maria = new User("2", "Maria Silva", "maria@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(denys, maria));
		return ResponseEntity.ok().body(list);
	}
}
