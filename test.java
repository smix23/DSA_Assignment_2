package school;

import java.util.Scanner;

public class test extends student
{
    public int mark1;
    public int mark2;
    
    public void input() 
    {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = scan.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = scan.nextInt();
    }
    
    public void output() 
    {
        super.output();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }

}
