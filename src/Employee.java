package src;

public class Employee extends Person{
    private double salary;

    public Employee(String firstName, String lastName, Byte age, Integer ssn, double salary){
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public String speak(){
        return "My name is " + getFirstName() + " " + getLastName() + " and my salary is $" + salary;
    }

    public double getSalary(){
        return salary;
    }
}


