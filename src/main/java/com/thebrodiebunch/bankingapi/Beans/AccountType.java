package com.thebrodiebunch.bankingapi.Beans;

import javax.persistence.*;

@Entity
@Table
public class AccountType {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // primary key
    
    @Column(nullable=false, unique=true)
	private String type; // not null, unique

	AccountType() {}; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		AccountType other = (AccountType) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AccountType [id=" + id + ", type=" + type + "]";
	}


}