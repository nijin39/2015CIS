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

@Entity
@Table(name = "saint", uniqueConstraints = {
		@UniqueConstraint(columnNames = "SAINT_ID")
})
public class Saint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SAINT_ID", unique = true, nullable = false)
	private long id;
	
	@Column(name = "SAINT_NAME", unique = false, nullable = false)
	private String name;
	
	@Column(name = "SAINT_GENDER", unique = false, nullable = false)
	private char gender;
	
	@Column(name = "SAINT_AGE", unique = false, nullable = false)
	private int age;
	
	@Column(name = "SAINT_HEAD", unique = false, nullable = true)
	private long head;

	@Column(name = "SAINT_BREEDER", unique = false, nullable = true)
	private long breeder;

	@Column(name = "SAINT_STATUS", unique = false, nullable = false)
	private String status;
	
	@Column(name = "SAINT_CLASSIFY", unique = false, nullable = false)
	private String classify;
	
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getHead() {
		return head;
	}

	public void setHead(long head) {
		this.head = head;
	}

	public long getBreeder() {
		return breeder;
	}

	public void setBreeder(long breeder) {
		this.breeder = breeder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Saint [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", age=" + age + ", head=" + head + ", breeder=" + breeder
				+ ", status=" + status + ", classify=" + classify + ", local="
				+ local + "]";
	}
 
	
}
