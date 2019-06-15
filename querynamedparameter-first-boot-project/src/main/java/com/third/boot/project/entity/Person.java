package com.third.boot.project.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
@Entity
@Table(name="person_table")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="person_id")
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String  lastName;
	@Column(name="email")
	private String email;
	@Column(name="create_date")
	private Date createDate;
	public Person(){
		
	}
	public Person( String firstName, String lastName, String email, Date createDate) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.createDate = createDate;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
}
