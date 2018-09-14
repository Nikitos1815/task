import java.util.*;

public class TestClass {
    public static void main(String args[]){
        List<Employee> staff = new ArrayList<>();
        SortedSet<Employee> stafff = new TreeSet<>();
        stafff.add(new Employee("Peter", 228,32));
        stafff.add(new Employee("Vasya", 232,33));
        stafff.add(new Manager("Ivan",201,6,30));
        stafff.add(new Manager("Nik", 263, 8,15));

        SortedSet<Employee> staffy = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                String a = o1.getName();
                String b = o2.getName();
                return a.compareTo(b);
            }
        });
        staffy.addAll(stafff);

        for (Employee st:staffy
             ) {
            System.out.println(st.getID() + "," + st.getSalary() + "," + st.getName());



        }
            int i = 0;
        int c = staffy.size();
        for (Employee st:staffy
             ) {

            if((i != c) && (i >= (c-3) ))
            {
                System.out.println(st.getID());
            }
            i++;
        }

    }

}
