package com.excursion.VenueService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.excursion.VenueService.model.City;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRepository extends CrudRepository<City, String>{

}
