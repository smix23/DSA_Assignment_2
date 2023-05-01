import java.util.Scanner;

import school.test;
import sports.sport;

public class grandtotal implements sport 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        test t = new test();
        t.input();

        System.out.print("Enter score 1: ");
        int score1 = scan.nextInt();
        System.out.print("Enter score 2: ");
        int score2 = scan.nextInt();

        int grandTotal = t.mark1 + t.mark2 + score1 + score2;
        System.out.println("Grand total marks: " + grandTotal);
    }
}
