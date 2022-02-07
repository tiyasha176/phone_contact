package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table (name = "contact details")

public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@NotNull
@Pattern(regexp = "[0-9 ]+")
@Size(max = 12)
private String mobile;
@Size(max = 15)
@NotNull
@NotBlank
private String first_name;
@Size(max = 15)
private String last_name;
@NotNull
private Integer age;
private String city;
private String street;
private Integer house_no;
private Integer pin;

public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public Integer getHouse_no() {
	return house_no;
}
public void setHouse_no(Integer house_no) {
	this.house_no = house_no;
}
public Integer getPin() {
	return pin;
}
public void setPin(Integer pin) {
	this.pin = pin;
}


}
