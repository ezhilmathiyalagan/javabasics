package com;

public class Student {
private String id;
private String FirstName;
private String LastName;
private String Gender;
private String branch;
private String Department;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	this.FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	this.LastName = lastName;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	this.Gender = gender;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	this.Department = department;
}
public String toString() {
	return id+","+FirstName+LastName+","+Gender+","+branch+","+Department;
}

}


