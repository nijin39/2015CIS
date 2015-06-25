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
/**
 * @author admin
 *
 */
@Entity
@Table(name = "roomsaint", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ASSIGN_ROOM_ID")
})  
public class RoomSaint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ASSIGN_ROOM_ID", unique = true, nullable = false)
	private long id;
	
	@ManyToOne
    @JoinColumn(name = "room", referencedColumnName = "ROOM_ID")
	@JsonManagedReference
    private Room room;
	
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Saint getSaint() {
		return saint;
	}

	public void setSaint(Saint saint) {
		this.saint = saint;
	}

	@Override
	public String toString() {
		return "RoomSaint [id=" + id + ", room=" + room.getId() + ", saint=" + saint.getId()
				+ "]";
	}
	
	

}
