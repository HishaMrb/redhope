package com.mql.redhope.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String firstName;

  private String lastName;
  
  private String address;
  
  private String phoneNumber;
  
  private BloodType bloodType;

  public Profile() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
	return address;
  }

  public void setAddress(String address) {
	this.address = address;
  }

  public String getPhoneNumber() {
	return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
  }

  public BloodType getBloodType() {
	return bloodType;
  }

  public void setBloodType(BloodType bloodType) {
	this.bloodType = bloodType;
  }
}
