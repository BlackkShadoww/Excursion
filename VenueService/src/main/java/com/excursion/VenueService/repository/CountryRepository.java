package com.excursion.VenueService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.excursion.VenueService.model.Country;

@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface CountryRepository extends CrudRepository<Country, String>{

}
