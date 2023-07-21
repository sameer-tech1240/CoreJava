package com.room;
public final class Student {
    private final int id;
    private final String name;
    public Student (int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    
    public void printStudentDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
    public static void main(String[] args) {
    	Student student = new Student(101, "sameer");
    	student.printStudentDetails();
	
		
	}
}
