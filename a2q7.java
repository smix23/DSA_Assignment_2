/*Define a base class Person with instance variable name, age. 
The instance variables are initialized through constructors. 
The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary.
The instance variables are initialized through constructors. 
The prototype of constructor is as below.
Employee (string, int, int, double). 
Another instance method of Employee class is empDisplay() 
to display the information of employee details. */

class person
{
    String name;
    int age;

    public person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
class employee extends person
{
    int eid;
    double salary;

    public employee(String name, int age, int eid, double salary)
    {
        super (name, age);

        this.eid = eid;
        this.salary = salary;
    }

    void empDisplay()
    {
        System.out.println("Employee name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Employee ID: "+eid);
        System.out.println("Salary: Rs."+salary);
    }

}

public class a2q7 
{
    public static void main(String[] args) 
    {
      employee e1 = new employee("Sai", 19, 6969, 5000000.0);
    
      e1.empDisplay();     
    } 
}
