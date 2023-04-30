/*Define a class Deposit. The instance variable of the class Deposit are mentioned below
* Initialize the instance variables Principal, Time, rate through constructors. Constructors are overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): 
to display the value of instance variables, (ii) calc_amt( ) to calculate the total amount.
Total_amt = Principal + (Principal×rate×Time)/100; */

class deposit
{
    long principal;
    int time;
    double rate;
    double tot_amount;

    public deposit()
    {
        principal=0;
        time=0;
        rate=0.0;
    }
    public deposit (long p, int t, double r)
    {
        principal = p;
        time = t; 
        rate = r;
    }
    public deposit(long p, int t)
    {
        principal = p;
        time =t;
        rate =0.0;
    }
    public deposit(long p, double r)
    {
        principal =p; 
        time =0;
        rate =r;
    }

    public void display()
    {
        System.out.println("Principal: "+principal);
        System.out.println("Time: "+time+" years");
        System.out.println("Rate: "+rate+"%");
    }

    public double calc_amt()
    {
        return tot_amount= principal+(principal+rate+time)/100;
    }
}
public class a2q5 
{
    public static void main(String[] args) 
    {
        deposit d1 = new deposit(10000, 2, 12.5);

        d1.display();

        System.out.println("Total amount: "+d1.calc_amt());   
    }
}
