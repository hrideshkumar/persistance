package com.manytoone.unidirectonal1;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
//@SequenceGenerator(name = "CUSTOMER_SEQUENCE", sequenceName = "CUSTOMER_SEQUENCE", allocationSize = 1, initialValue = 0)
public class Customer {

	@Id
    @GeneratedValue
    private int id;
 
    @Column
    private String name;
 
    
 
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    //@JoinTable(name="CUSTOMER_HAS_DOGS", joinColumns={@JoinColumn(name="CUSTOMER_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="DOG_ID", referencedColumnName="id")})
    @JoinColumn(name="id")
    private List<Dog> dogs;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List getDogs() {
		return dogs;
	}



	public void setDogs(List dogs) {
		this.dogs = dogs;
	}
    
}

