package com.thebrodiebunch.bankingapi.Beans;

import javax.persistence.*;

@Entity
@Table(name="account_type")
public class AccountType {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // primary key
    
    @Column(nullable=false, unique=true)
	private String name; // not null, unique

	AccountType() {}; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return name;
	}
	public void setType(String type) {
		this.name = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AccountType [id=" + id + ", type=" + name + "]";
	}


}