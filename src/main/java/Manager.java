import java.util.*;
public class Manager extends Employee  {
    private int hours;

    public Manager(String name, int id,int hours,double salary){
        super(name,id,salary);
        this.hours = hours;
    }

    public double getSalary() {
       double salary = 20.8*8*this.hours;
       return salary;
    }
}
