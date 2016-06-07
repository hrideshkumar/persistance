package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	@Id
	@GeneratedValue
	@Column(name = "account_id")
	private int id;

	@Column(name = "balance")
	private int balance;

	@OneToOne(mappedBy = "account")
	private Student student;

	public Account() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getEmployee() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Account(int balance) {
		super();
		this.balance = balance;
		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", employee=" + student + "]";
	}

	
}
