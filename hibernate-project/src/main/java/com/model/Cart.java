package com.model;

import java.util.Iterator;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity
@Table(name="CART")
@Cacheable(true)
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE )
public class Cart {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cart_id")
    private long id;
     
    @Column(name="total")
    private double total;
     
    @Column(name="name")
    private String name;
     
    @OneToMany(mappedBy="cart")
    private Set<Items> items;

    public Cart(){
    	
    }
	public Cart(double total, String name, Set<Items> items) {
		super();
		
		this.total = total;
		this.name = name;
		this.items = items;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	public String print(){
		String setItemd = setToString(items);
		return this.id +" "+" "+setItemd;
	}
	private String setToString(Set<Items> items2){
		String result = null;
		Iterator iterator = items2.iterator(); 
	      
		   // check values
		   while (iterator.hasNext()){
			   result = result+"Value: "+iterator.next() + " ";  
		   }
		
		return result;
	}
	/*@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", name=" + name + ", items=" + items + "]";
	}*/

}
