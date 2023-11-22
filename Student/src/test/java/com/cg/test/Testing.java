package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.model.Student;

public class Testing {

	@Test
	void testStudentDetails() {
	        Student student = new Student();
	        student.setName("Sravani");
	        student.setAge(23);
	        student.setSalary(23000);
	        assertEquals("Sravani", student.getName());
	        assertEquals(23, student.getAge());
	        assertEquals(23000, student.getSalary(), 0.001);
}
}
