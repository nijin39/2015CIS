package com.church.conference.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "local", uniqueConstraints = {
		@UniqueConstraint(columnNames = "LOCAL_ID")
})
public class Local {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="LOCAL_ID", unique = true, nullable = false)
	private long id;
	
	@Column(name = "LOCAL_NAME", unique = false, nullable = false)
	private String name;

	@Column(name = "PLOCAL_ID", unique = false, nullable = true)
	private Long plocalId;
	
	@Column(name = "LOCAL_ELDER", unique = false, nullable = false)
	private String elder;
	
	@Column(name = "LOCAL_LEVEL", unique = false, nullable = false)
	private Integer level;
	
	@OneToMany(mappedBy = "local")
	@JsonBackReference
    private List<Car> carList;
	
	@OneToMany(mappedBy = "local")
	@JsonBackReference
    private List<Room> roomList;
	
	@OneToMany(mappedBy = "local")
	@JsonBackReference
    private List<Saint> saintList;


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

	public Long getPlocalId() {
		return plocalId;
	}

	public void setPlocalId(Long plocalId) {
		this.plocalId = plocalId;
	}

	public String getElder() {
		return elder;
	}

	public void setElder(String elder) {
		this.elder = elder;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public List<Saint> getSaintList() {
		return saintList;
	}

	public void setSaintList(List<Saint> saintList) {
		this.saintList = saintList;
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", name=" + name + ", plocalId=" + plocalId
				+ ", elder=" + elder + ", carList=" + carList + ", roomList="
				+ roomList + "]";
	}

}
