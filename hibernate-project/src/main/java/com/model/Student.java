package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
    @GeneratedValue
    @Column(name="student_id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	
	@OneToOne
	@JoinColumn(name="ACCOUNT_ID")
	private Account account;
	
	public Student(){
		
	}

	public Student(String email, String name) {
		super();
		this.email = email;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", name=" + name+"]";
	}

}
