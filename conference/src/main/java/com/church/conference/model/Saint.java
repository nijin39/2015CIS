package com.church.conference.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "groups", uniqueConstraints = {
		@UniqueConstraint(columnNames = "GROUP_NAME")
})
public class Saint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="GROUP_ID", unique = true, nullable = false)
	private long id;
	
	@Column(name = "GROUP_NAME", unique = true, nullable = false)
	private String name;
	
	@Column(name = "THREAD_POOL_SIZE", unique = false, nullable = false)
	private int threadPoolSize;

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

	public int getThreadPoolSize() {
		return threadPoolSize;
	}

	public void setThreadPoolSize(int threadPoolSize) {
		this.threadPoolSize = threadPoolSize;
	}

	@Override
	public String toString() {
		return "Groups [id=" + id + ", name=" + name + ", threadPoolSize="
				+ threadPoolSize + "]";
	}
	
	
}
