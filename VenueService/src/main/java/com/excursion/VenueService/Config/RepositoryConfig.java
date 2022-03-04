package com.excursion.VenueService.Config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.excursion.VenueService.model.City;
import com.excursion.VenueService.model.Country;
import com.excursion.VenueService.model.State;


@Component
public class RepositoryConfig implements RepositoryRestConfigurer{
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config,CorsRegistry cors)
	{
		
		config.exposeIdsFor(Country.class,State.class,City.class);
	}

}
