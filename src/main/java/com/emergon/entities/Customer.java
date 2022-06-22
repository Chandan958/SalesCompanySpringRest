package com.emergon.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
	@Id
	private Integer ccode;

	private String name;

	public Customer() {
	}

	public Customer(Integer ccode, String name) {
		this.ccode = ccode;
		this.name = name;
	}

	public Customer(String name) {
		this.name = name;
	}

	public Integer getCcode() {
		return ccode;
	}

	public void setCcode(Integer ccode) {
		this.ccode = ccode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer{" + "ccode=" + ccode + ", name=" + name + '}';
	}

}
