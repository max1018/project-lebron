package com.springboot.lebron.managersAndInterfaces;

import com.springboot.lebron.model.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param email the user email.
     */
    public User findByEmail(String email);

    /**
     * Return the user having the passed id or null if no user is found.
     *
     * @param id the user email.
     */
    public User findById(int id);
}

