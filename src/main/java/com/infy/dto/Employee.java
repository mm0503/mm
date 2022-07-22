package com.infy.dto;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Employee {
     @Id
     @Column(name="eno")
	  int empNo;
     @Column(name="ename",length=20)
	  String empName;
     @Column(name="esal")
	  int empSal;
     @OneToOne(cascade = CascadeType.ALL)
     Office officeId;
     
	public Employee() {
		super();
	}
	public Employee(int empNo, String empName, int empSal, Office officeId) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.officeId = officeId;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public Office getOfficeId() {
		return officeId;
	}
	public void setOfficeId(Office officeId) {
		this.officeId = officeId;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", officeId=" + officeId
				+ "]";
	}
     
     
}

