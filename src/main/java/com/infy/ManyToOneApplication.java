package com.infy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.repository.DepartmentRepository;
import com.infy.repository.EmployeeRepository;

@SpringBootApplication
public class ManyToOneApplication implements CommandLineRunner {
  
	 @Autowired
	 DepartmentRepository deptRepo;
	 @Autowired
	 EmployeeRepository empRepo;
	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}
	 public void addRecord() {
		 Department dept = new Department();
	    	dept.setDepartmentId(200);
	    	dept.setDepartmentName("Developer");
	    	
	    	Employee emp1 = new Employee(1,"Manisha",1500,dept);
	    	Employee emp2 = new Employee(2,"Nagma",1660,dept);
	    	Employee emp3 = new Employee(3,"Sneha",1700,dept);
	    	
	    empRepo.save(emp1);
	    empRepo.save(emp2);
	    empRepo.save(emp3);
	    	//deptRepo.save(dept);
	     }
	 
	    public void getRecord() {
	    	Employee e = empRepo.findById(2).get();
	    	System.out.println(e.getEmpName()+" "+e.getEmpSal());
	    	System.out.println("*****Department Details*****");
	    		System.out.println(e.getDept().departmentId+" "+e.getDept().departmentName);
	    	}
	  
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//addRecord();
		getRecord();
	}

}
