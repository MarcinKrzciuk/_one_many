package com.example.demo;

import com.example.demo.entieties.Comment;
import com.example.demo.entieties.Post;
import com.example.demo.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private PostsRepository postsRepository;


	@Override
	public void run(String... args) throws Exception {
		Post posts = new Post("test", "one to many mapping");
		Comment comments1 = new Comment("This is ok");
		Comment comments2 = new Comment("sounds good");
		Comment comments3 = new Comment("amazing");

		posts.getComments().add(comments1);
		posts.getComments().add(comments2);
		posts.getComments().add(comments3);

		this.postsRepository.save(posts);

	}
}
