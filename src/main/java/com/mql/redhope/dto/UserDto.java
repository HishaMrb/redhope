package com.mql.redhope.dto;

import com.mql.redhope.models.BloodType;

public class UserDto {
  
  private String email;
  
  private String password;
  
  private String firstName;
  
  private String lastName;
  
  private String address;
  
  private String phoneNumber;
  
  private BloodType bloodType;

  
  public UserDto() {
    
  }
  
  public UserDto(String email, String password, String firstName, String lastName) {
    this.email = email;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  @Override
  public String toString() {
    return "first Name : " + firstName + " last Name : " + lastName  + " email" + email + " password " + password;
  }
  
}
