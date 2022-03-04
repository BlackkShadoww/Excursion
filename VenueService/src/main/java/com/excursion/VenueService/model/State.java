package com.excursion.VenueService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class State {

	@Id
	@Column(name="STATE_ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid",strategy = "org.hibernate.id.UUIDGenerator")
	private String uuid;
	
	@Column(name="STATE_NAME")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="COUNTRY_ID")
	private Country countryId;
	
	
}
