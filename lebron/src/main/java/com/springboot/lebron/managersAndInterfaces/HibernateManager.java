package com.springboot.lebron.managersAndInterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//this class is the manager for all repositorys and needs the given annotations
@Service
public class HibernateManager {

    @Autowired
    private ProjectJoinRequestRepository projectJoinRequestRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    public ProjectJoinRequestRepository getJoinRequestRepository() {
        return projectJoinRequestRepository;
    }

    public ProjectRepository getProjectRepository() {
        return projectRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }

}
