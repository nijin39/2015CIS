package com.church.conference.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "car", uniqueConstraints = {
		@UniqueConstraint(columnNames = "CAR_ID")
})
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CAR_ID", unique = true, nullable = false)
	private long id;
	
	@Column(name = "CAR_NAME", unique = false, nullable = false)
	private String name;

	@Column(name = "DRIVER_ID", unique = false, nullable = true)
	private long driverId;
	
	@Column(name = "CAR_CAPACITY", unique = false, nullable = false)
	private int capacity;
	
	@ManyToOne
    @JsonBackReference
    private Local local;
 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", driverId=" + driverId
				+ ", capacity=" + capacity + "]";
	}

}
