package com.springboot.lebron.managersAndInterfaces;

import com.springboot.lebron.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
