package com.excursion.UserService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "UserDetails")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private String uuid;
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL_ID")
	private String emailId;
	@Column(name="PASSWORD")
	private String pwd;
	@Column(name="IMAGE")
	private String img;
}
