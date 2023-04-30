/*Write a Java program to declare a Class named as Student which contains roll number, 
name and course as instance variables and input_Student () and display_Student () as instance methods. 
A derived class Exam is created from the class Student. 
The derived class contains mark1, mark2, mark3 as instance variables representing the marks of three 
subjects and input_Marks () and display_Result () as instance methods. 
Create an array of objects of the Exam class and display the result of 5 studen */


import java.util.Scanner;
class student
{
    int roll_num;
    String name;
    String course;

    void input_student()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = scan.next();
        System.out.println("Enter roll number: ");
        roll_num = scan.nextInt();
        System.out.println("Enter course: ");
        course = scan.next();

    }

    void display_student()
    {
        System.out.println("Name of student: "+name);
        System.out.println("Student roll: "+roll_num);
        System.out.println("Course: "+course);
    }
}

class exam extends student
{
    int mark1, mark2, mark3;

    void input_marks()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter marks in DSA: ");
        mark1 = scan.nextInt();
        System.out.println("Enter marks in IGT: ");
        mark2 = scan.nextInt();
        System.out.println("Enter marks in UPEM: ");
        mark3 = scan.nextInt();

    }

    void display_result()
    {
        System.out.println("Marks in DSA: "+mark1);
        System.out.println("Marks in IGT: "+mark2);
        System.out.println("Marks in UPEM: "+mark3);
    }
}
public class a2q9 
{
    public static void main(String[] args) 
    {
        exam[] students = new exam[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new exam();

            System.out.println("Enter details for Student " + (i+1));
            students[i].input_student();
            students[i].input_marks();
        }

        System.out.println("Results:");

        for (int i = 0; i < students.length; i++) 
        {
            System.out.println("Student " + (i+1));
            students[i].display_student();
            students[i].display_result();
            System.out.println();
        }
    }
}
