package com.sorj.post.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sorj.post.model.Post;
import com.sorj.post.repositories.PostRepository;


@RestController
@RequestMapping(path = "/posts")
public class PostController {

	@Autowired
	PostRepository postRepository;

	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public Post getPost(@PathVariable("id") Long id) {
		return postRepository.findOne(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Post> getPosts() {
		return postRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createPost(@RequestBody Post post) {
		postRepository.save(post);
	}

}
