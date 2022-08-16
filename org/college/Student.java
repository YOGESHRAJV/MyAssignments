package org.college;


public class Student extends Department {
	public void studentName() {
		System.out.println("YOGESHRAJ");
	}
public void studentDept() {
	System.out.println("HVE");
}
public void studentId() {
	System.out.println("8048");
}
public static void main(String[] args) {
	Student stu =new Student();
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.deptName();
	stu.studentName();
	stu.studentDept();
	stu.studentId();
	

}
}
 