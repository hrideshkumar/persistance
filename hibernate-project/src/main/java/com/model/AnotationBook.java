package com.model;

import java.util.*;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "BOOKS")
public class AnotationBook {

	@Id
	private String isbn;
	private String title;
	

	@ManyToMany
	private final List<Author> authors = new ArrayList<Author>();
	
	@Temporal(TemporalType.DATE)
	private Date published;

	AnotationBook() {
	}

	public AnotationBook(String isbn, String title, Date published) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.published = published;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	@Override
	public String toString() {
		return "AnotationBook [isbn=" + isbn + ", title=" + title + ", authors=" + authors + ", published=" + published
				+ "]";
	}

	

}
