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
@Table(name = "room", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ROOM_ID")
})  
public class CarSaint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ROOM_ID", unique = true, nullable = false)
	private long id;
	
	@Column(name = "ROOM_NAME", unique = false, nullable = false)
	private String name;
	
	@Column(name = "ROOM_CAPACITY", unique = false, nullable = false)
	private int capacity;
	
	@ManyToOne
    @JoinColumn(name = "local", referencedColumnName = "LOCAL_ID")
	@JsonManagedReference
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
		return "Room [id=" + id + ", name=" + name + ", capacity=" + capacity
				+ ", local=" + local + "]";
	}

}
