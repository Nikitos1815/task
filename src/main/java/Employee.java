import java.util.*;
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
    private int ID;


    public Employee(String name,int id,double salary){
       this.ID = id;
        this.name = name;
        this.salary = salary;
    }

    public String  getName(){
        return this.name;

    }

    public double getSalary(){
        return this.salary;
    }
    public int getID(){
        return this.ID;
    }
    public int compareTo(Employee other){
        return Double.compare(this.salary, other.salary);

    }


}
