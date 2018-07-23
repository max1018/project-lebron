package com.springboot.lebron.managersAndInterfaces;

import com.springboot.lebron.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
