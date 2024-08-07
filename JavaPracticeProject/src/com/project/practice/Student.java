package com.project.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

private int id;
private String name;
private String standard;
private Map<String, Integer> marks;

public Student( int id, String name, String standard) {
	this.id= id;
	this.setName(name);
	this.setStandard(standard);
	this.marks= new HashMap<>();
}

public int getid() {
	return id;
	
}

public void setid(int id) {
	this.id=id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getStandard() {
	return standard;
}

public void setStandard(String standard) {
	this.standard = standard;
}

public Map<String, Integer> getMarks() {
	return marks;
}

public void setMarks(Map<String, Integer> marks) {
	this.marks = marks;
}

// Method to add a mark for a subject
public void addMark(String subject, int mark) {
    this.marks.put(subject, mark);

}

public static void main(String[] args) {
    // Create a list to store Student objects
    List<Student> students = new ArrayList<>();

    // Create Student objects
    Student student1 = new Student(1, "Raj", "10th Grade");
    student1.addMark("Math", 95);
    student1.addMark("Science", 90);

    Student student2 = new Student(2, "Ashish", "10th Grade");
    student2.addMark("Math", 85);
    student2.addMark("Science", 88);

    // Add students to the list
    students.add(student1);
    students.add(student2);

    // Iterate through the list of students
    for (Student student : students) {
        System.out.println("ID: " + student.getid());
        System.out.println("Name: " + student.getName());
        System.out.println("Standard: " + student.getStandard());

        // Iterate through the marks of each student
        for (Map.Entry<String, Integer> entry : student.getMarks().entrySet()) {
            System.out.println("Subject: " + entry.getKey() + ", Mark: " + entry.getValue());
        }

        System.out.println();
    }
}




}

