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
public class City {
	@Id
	@Column(name="CITY_ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid",strategy = "org.hibernate.id.UUIDGenerator")
	private String uuid;
	
	@Column(name="CITY_NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name="STATE_ID")
	private State countryId;
}
