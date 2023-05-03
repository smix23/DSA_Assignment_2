/*Define an interface DetailInfo to declare methods display ( ) & count ( ). 
Another class Person contains a static data member maxcount, 
instance member name & method display ( ) to display name of a person,
count the no. of characters present in the name of the person */

interface DetailInfo 
{
    void display();
    int count();
}

class person implements DetailInfo 
{
    static int maxcount = 0;
    String name;

    public person(String n) 
    {
        name = n;
    }

    public void display() 
    {
        System.out.println("Name: " + name);
    }

    public int count() 
    {
        int length = name.length();
        if (length > maxcount) 
        {
            maxcount = length;
        }
        return length;
    }
    
}
public class a2q8
{
    public static void main(String[] args) 
    {
        person p1 = new person("Tony Stark");
        person p2 = new person("Steven Rogers");
        p1.display();
        System.out.println("Count: " + p1.count());
        p2.display();
        System.out.println("Count: " + p2.count());
        System.out.println("Max count: " + person.maxcount);
    }
}

