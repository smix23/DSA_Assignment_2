/*Define a class Phone to store these three parts of a phone number separately as instance variable 
(area_code, exchange, number). 
The class consists of two member methods: input ( ) and display ( ). 
Create two class objects of type phone. 
Initialize one directly (by using dot (.) operator and instance variable with 
value area_code: 212, exchange: 767, number: 8900), 
and initialize other from the user through member method input ( ). 
Display both the numbers. */

import java.util.Scanner;
public class a2q1 
{
    public static void main(String[] args) 
    {
        phone p1 = new phone();

        p1.area_code= 212;
        p1.exchange=767;
        p1.number=8900;

        phone p2 = new phone();

        p2.input();
       
        System.out.println("My Number is ("+p1.area_code+") "+p1.exchange+"-"+p1.number);

        p2.display();

    }
}

class phone
{
    int area_code;
    int exchange;
    int number;

    public void input()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the area code: ");
        area_code= scan.nextInt();
        System.out.println("Enter the exchange number: ");
        exchange= scan.nextInt();
        System.out.println("Enter the number ");
        number= scan.nextInt();

        scan.close();

    }

    public void display()
    {
        System.out.println("Your Number is ("+area_code+") "+exchange+"-"+number);


    }

}

