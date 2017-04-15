package com.sorj.post;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.sorj.post.model.Post;
import com.sorj.post.repositories.PostRepository;

@SpringBootApplication
public class PostApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApplication.class, args);
	}

	
	@Bean
	@Profile("!cloud")
	public CommandLineRunner demoData(PostRepository repository) {
		return (args) -> {
			repository.save(new Post("Post 1"));
			repository.save(new Post("Post 2"));
			repository.save(new Post("Post 3"));
		};
	}
}
