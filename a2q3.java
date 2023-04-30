/*Define a class called Student with instance variables Roll, Name, DSA_Mark.
Also, the class consists of instance methods getdata( ), showdata( ) 
to provide input to the instance variable and to display the value of instance variable. 
Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark.*/

import java.util.Scanner;
class student
{
    String Name;
    int Roll;
    double DSA_Mark;

    void getData()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Student Roll: ");
        Roll = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Student name: ");
        Name = scan.nextLine();
        System.out.println("Enter marks in DSA: ");
        DSA_Mark = scan.nextDouble();

    }

    void showData()
    {
        System.out.println("Name: "+Name);
        System.out.println("Roll no.: "+Roll);
        System.out.println("Marks secured: "+DSA_Mark);
    }
}

public class a2q3
{
    public static void main(String[] args) 
    {
        student []s = new student[5];

        for (int i=0; i<5; i++)
        {
            System.out.println("Enter details for student "+(i+1)+": ");
            s[i]= new student();
            s[i].getData();
        }

        int maxIndex = 0; 
        double maxDSA = 0;

        for (int i=1; i<s.length; i++)
        {
            if (s[i].DSA_Mark > maxDSA)
            {
                 maxDSA = s[i].DSA_Mark;
                 maxIndex = i;
            }
        }

        System.out.println("Details of student with highest DSA Mark:");
        s[maxIndex].showData();
        
    }
}
    