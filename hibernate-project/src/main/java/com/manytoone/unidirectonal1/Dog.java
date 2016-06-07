package com.manytoone.unidirectonal1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DOG")
//@SequenceGenerator(name = "DOG_SEQUENCE", sequenceName = "DOG_SEQUENCE", allocationSize = 1, initialValue = 0)
public class Dog {

	@Column
	private String name;

	public Dog() {

	}

	public Dog(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
