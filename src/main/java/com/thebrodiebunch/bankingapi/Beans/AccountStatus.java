package com.thebrodiebunch.bankingapi.Beans;

import javax.persistence.*;

@Entity
@Table
public class AccountStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // primary key

	@Column(nullable=false, unique=true)
	private String status; // not null, unique

	AccountStatus() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountStatus other = (AccountStatus) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountStatus [id=" + id + ", status=" + status + "]";
	}; 


}