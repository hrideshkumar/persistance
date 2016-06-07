package com.manytoone.unidirectonal1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findUnversityById",  
	        query = "from University e where e.id = :id"  
	        )  
	    }  
	)  

@Entity
@Table(name = "UNIVERSITY")
public class University {
	
	@Id
    @GeneratedValue
    @Column(name = "UNIVERSITY_ID")
    private long id;
 
    @Column(name = "NAME")
    private String name;
 
    @Column(name = "COUNTRY")
    private String country;
 
    //@OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
    private List<Student1> students;
 
    public University() {
 
    }
 
    public University(String name, String country) {
        this.name = name;
        this.country = country;
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
 
    public List<Student1> getStudents() {
        return students;
    }
 
    public void setStudents(List<Student1> students) {
        this.students = students;
    }
 
    @Override
    public String toString() {
        return "University [id=" + id + ", name=" + name + ", country="
                + country + "]";
    }

}
