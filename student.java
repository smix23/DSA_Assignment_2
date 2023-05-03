// a2q10 part-1

package school;

import java.util.Scanner;

public class student 
{
    String name;
    int roll;
    
    public void input() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scan.nextLine();
        System.out.print("Enter roll number: ");
        roll = scan.nextInt();
    }
    
    public void output() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
    }   
}
