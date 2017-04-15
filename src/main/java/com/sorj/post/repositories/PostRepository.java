package com.sorj.post.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sorj.post.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
