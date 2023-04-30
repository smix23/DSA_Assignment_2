// Write a Java program to add two complex numbers

public class a2q2 
{
    public static void main(String[] args) 
    {

        complex c1 = new complex ();

        c1.setData (2.9, 4.3);
        System.out.print("c1 = ");
        c1.display();

        complex c2 = new complex ();

        c2.setData(5.2, -8.1);
        System.out.print("c2 = ");
        c2.display();

        complex sum = new complex ();

        sum = sum.add(c1, c2);
        System.out.print("sum = ");
        sum.display();
    }
    
}

class complex 
{
    double real;
    double imag;

    void setData(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    void display ()
    {
        System.out.println(real+ " + "+imag+ "i");
    }

    public complex add(complex x, complex y) 
    {
        complex result = new complex();
        result.real = x.real + y.real;
        result.imag = x.imag + y.imag;

        return result;
    }

}


