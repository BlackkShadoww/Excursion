package com.excursion.VenueService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {
	
	@Id
	@Column(name="COUNTRY_ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid",strategy = "org.hibernate.id.UUIDGenerator")
	private String uuid;
	
	@Column(name="COUNTRY_NAME")
	private String name;

}
