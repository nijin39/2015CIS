package com.church.conference.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/*
 * pLocalId : Self reference column change need
 */
@Entity
@Table(name = "summary", uniqueConstraints = {
		@UniqueConstraint(columnNames = "SUMMARY_ID")
})
public class Summary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SUMMARY_ID", unique = true, nullable = false)
	private long id;
	
	@Column(name = "DATE", unique = false, nullable = false)
	private Date date;
	
	@Column(name = "COUNT", unique = false, nullable = false)
	private Integer count;

	public Summary(Date date, Integer count) {
		super();
		this.date = date;
		this.count = count;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Summary [date=" + date + ", count=" + count + "]";
	}
	
}
