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
	
	@Column(name = "COUNTDATE", unique = false, nullable = false)
	private Date countDate;
	
	@Column(name = "COUNT", unique = false, nullable = false)
	private Integer count;

	public Date getCountDate() {
		return countDate;
	}

	public void setCountDate(Date countDate) {
		this.countDate = countDate;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Summary [countDate=" + countDate + ", count=" + count + "]";
	}

}
