/*Define a class called product. 
Two instance variables of the class are pid (product-id) and price (product price). 
It consists of one static variable tot_price (total price). 
Initialize the value of instance variables through parameterized constructor. 
It consists of a display ( ) method to display the value of instance variables. 
A person went to market and purchase 5 different products. 
Using the above mentioned class, display the details of products that the person has purchased. 
Also, determine how much total amount the person will pay for the purchase of 5 products. */

class product 
{
    int pid;
    double price;
    private static double tot_price = 0;

    public product(int pid, double price) 
    {
        this.pid = pid;
        this.price = price;
        tot_price = tot_price+ price;
    }

    void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product price: Rs." + price);
    }

}

public class a2q4 
{
    public static void main(String[] args) 
    {
        product []item = new product[5];
        
        double tot_price=0;

        item[0] = new product(101, 9.99);
        item[1] = new product(102, 10.99);
        item[2] = new product(103, 11.99);
        item[3] = new product(104, 12.99);
        item[4] = new product(105, 13.99);

        for (int i=0; i < item.length; i++)
        {
            System.out.println("Item "+(i+1)+ ": ");
            item[i].display();
            System.out.println();
            tot_price = tot_price+item[i].price;
        }
        
        System.out.println("Total price: Rs."+tot_price);
        
    }
}