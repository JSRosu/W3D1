package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Student name is : Jeba Roslin");

	}
	
public void studentDept() {
		
		System.out.println("Student dept is : ECE");

	}

public void studentId() {
	
	System.out.println("Student ID is : 1343");

}
public static void main(String[] args) {
	
	Student studObj = new Student();
	System.out.println("***Call for College class from org.College package***");
	studObj.collegeCode();
	studObj.collegeName();
	studObj.collegeRank();
	
	
	System.out.println("***Call for Department class from org.dept package***");
	studObj.deptName();
	
	
	System.out.println("***Call for Student class from org.student package***");
	studObj.studentDept();
	studObj.studentId();
	studObj.studentName();
}

}
