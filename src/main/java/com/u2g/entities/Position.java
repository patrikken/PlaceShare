package com.u2g.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Position implements Serializable {
	@Id
	@GeneratedValue
	private long id;

	private long lat;

	private long lon;

	private String title;

	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_USER")
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getLat() {
		return lat;
	}

	public void setLat(long lat) {
		this.lat = lat;
	}

	public long getLon() {
		return lon;
	}

	public void setLon(long lon) {
		this.lon = lon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Position() {
		super();
	}

	public Position(long lat, long lon, String title, String description,
			User user) {
		super();
		this.lat = lat;
		this.lon = lon;
		this.title = title;
		this.description = description;
		this.user = user;
	} 

}
