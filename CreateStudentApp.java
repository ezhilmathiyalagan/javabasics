package com;

public class CreateStudentApp {
	public static void main(String arg[]) {
		Student student = new Student();
		student.setId("731615106018");
		student.setFirstName("ezhil");
		student.setLastName("mathi");
		student.setGender("female");
		student.setBranch("B.E");
		student.setDepartment("ECE");
		System.out.println(student);
		// System.out.println(student.getId());
		//System.out.println(student.getFirstName() + student.getLastName());
		//System.out.println(student.getGender());
		//System.out.println(student.getBranch());
		//System.out.println(student.getDepartment());
	}

}
