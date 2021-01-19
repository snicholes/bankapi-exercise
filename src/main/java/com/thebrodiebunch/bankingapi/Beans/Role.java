package com.thebrodiebunch.bankingapi.Beans;

import javax.persistence.*;

@Entity
@Table
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // primary key

	@Column(nullable=false, unique=true)
	private String role; // not null, unique

	Role() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		Role other = (Role) obj;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}; 


}