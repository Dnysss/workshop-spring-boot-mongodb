package com.dnys.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.dnys.workshopmongo.domain.Post;
import com.dnys.workshopmongo.domain.User;
import com.dnys.workshopmongo.repository.PostRepository;
import com.dnys.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("21/03/2024"), "Partiu viagem!", "Vou viajar para o Rio. Abraços!", maria);
		Post post2 = new Post(null, sdf.parse("21/03/2024"), "example", "example", maria);
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob ));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}

}
