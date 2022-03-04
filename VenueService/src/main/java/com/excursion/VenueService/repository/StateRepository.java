package com.excursion.VenueService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.excursion.VenueService.model.State;

@RepositoryRestResource(collectionResourceRel = "state", path = "state")
public interface StateRepository extends CrudRepository<State,String>{

}
