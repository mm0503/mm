package com.infy;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	     @ManyToOne(cascade = CascadeType.ALL)
	     Department dept;
	     
		public Employee() {
			super();
		}

		public Employee(int empNo, String empName, int empSal, Department dept) {
			super();
			this.empNo = empNo;
			this.empName = empName;
			this.empSal = empSal;
			this.dept = dept;
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

		public Department getDept() {
			return dept;
		}

		public void setDept(Department dept) {
			this.dept = dept;
		}

		@Override
		public String toString() {
			return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", dept=" + dept + "]";
		}
		
}
