package com.springboot.lebron.managersAndInterfaces;

import com.springboot.lebron.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    /**
     * Return all posts by the usersID
     *
     * @param userId the user id.
     */
    public List<Post> findByUserId(Integer userId);

    /**
     * Return all posts by the usersID
     *
     * @param projectId the user id.
     */
    public List<Post> findByProjectId(Integer projectId);
}
