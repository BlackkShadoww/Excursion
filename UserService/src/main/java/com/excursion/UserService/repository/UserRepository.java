package com.excursion.UserService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.excursion.UserService.model.User;

@RepositoryRestResource(collectionResourceRel = "user Details", path = "users")
public interface UserRepository extends CrudRepository<User, String>{

}
