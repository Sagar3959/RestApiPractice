package com.sb.demo.rest.emp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
private int empId;
private String eName;
private String role;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", eName=" + eName + ", role=" + role + "]";
}

}
