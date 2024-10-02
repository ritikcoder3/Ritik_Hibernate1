package com.hibernate.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table               //If Table name different of class name when use [@Table(name="Name can be Anything")]
public class Student {
	 
      @Id
      //@GeneratedValue(strategy= GenerationType.IDENTITY)   // Value of id not Require in object 
	 private int id;
      @Column
	 private String name;
	 private String gender;
	 private String email;
	 private String city;
	 
	
	public Student( int id,String name, String gender, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public int getId() {
			return id;
		}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 

}
