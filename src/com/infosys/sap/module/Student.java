package com.infosys.sap.module;

public class Student {
    //vraiables
    //methods
    //constructors
    //blocks
    int rollno;
    String name;
    String course;
    String address;
    static String college="JNTU";

    public Student(int rollno, String name, String course, String address) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.address = address;
    }

   public void printStudentDetails(){
        System.out.println("student rollno is "+rollno);
        System.out.println("student name is "+name);
        System.out.println("student course is "+course);
        System.out.println("student address is "+address);
        System.out.println("college name is "+Student.college);
    }

    public static void main(String[] args) {
        Student s1= new Student(123,"sudheer","MCA","India");
       /* System.out.println("student roll no is "+s1.rollno);
        System.out.println("student name  is "+s1.name);
        System.out.println("student course is "+s1.course);
        System.out.println("student address is "+s1.address);*/
        s1.printStudentDetails();
        System.out.println("===============================================");
        Student s2= new Student(133,"suresh","Btech","Srilanka");
        s2.printStudentDetails();

    }
}
