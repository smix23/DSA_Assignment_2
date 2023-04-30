//Create an abstract class Shape and the derived classes Square, Triangle and Circle. 
//Write a java program to display area of different shapes

abstract class shape
{
    abstract double getArea();
}
class square extends shape 
{
    double side;
    square(double s)
    {
        side =s;
    }
    double getArea()
    {
        return side*side;
    }
}
class triangle extends shape 
{
    double base, height;

    triangle(double b, double h)
    {
        base = b;
        height = h;
    }
    double getArea()
    {
        return 0.5*base*height;
    }
}
class circle extends shape 
{
    double radius;
    circle(double r) 
    {
        radius = r;
    }
    double getArea() 
    {
        return Math.PI*radius*radius;
    }
}

public class a2q6 
{
    public static void main(String[] args) 
    {
        square s = new square(5);
        triangle t = new triangle(3, 4);
        circle c = new circle(7);

        System.out.println("Area of square with side 5: " + s.getArea()+ " sqmt.");
        System.out.println("Area of triangle with base 3 and height 4: " + t.getArea()+ " sqmt.");
        System.out.println("Area of circle with radius 7: " + c.getArea()+ " sqmt.");
    }
}