package com.example.demo;

import com.example.demo.entieties.Comments;
import com.example.demo.entieties.Posts;
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
		Posts posts = new Posts("test", "one to many mapping");
		Comments comments1 = new Comments("This is ok");
		Comments comments2 = new Comments("sounds good");
		Comments comments3 = new Comments("amazing");

		posts.getCommentsList().add(comments1);
		posts.getCommentsList().add(comments2);
		posts.getCommentsList().add(comments3);

		this.postsRepository.save(posts);

	}
}
