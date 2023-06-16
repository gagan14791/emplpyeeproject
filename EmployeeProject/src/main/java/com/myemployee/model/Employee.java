package com.myemployee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@Column(name="empid")
	int empid;
	
	@Column(name="contactno")
	int contactno;
	
	@Column(name="empname")
	String empname;
	
	@Column(name="email")
	String email;
	
	
	public int getEmpid() {
		return empid;
	} 
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	

}
