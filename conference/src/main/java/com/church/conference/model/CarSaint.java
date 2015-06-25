package com.church.conference.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author admin
 *
 */
@Entity
@Table(name = "carsaint", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ASSIGN_CAR_ID")
})  
public class CarSaint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ASSIGN_CAR_ID", unique = true, nullable = false)
	private long id;
	
	@ManyToOne
    @JoinColumn(name = "car", referencedColumnName = "CAR_ID")
	@JsonManagedReference
    private Car car;
	
	@ManyToOne
    @JoinColumn(name = "saint", referencedColumnName = "SAINT_ID")
	@JsonManagedReference
    private Saint saint;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Saint getSaint() {
		return saint;
	}

	public void setSaint(Saint saint) {
		this.saint = saint;
	}
	
	
}
