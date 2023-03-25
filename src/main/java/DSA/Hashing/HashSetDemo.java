package DSA.Hashing;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();
        Employee john = new Employee("John", "IT", 10000);
        Employee james = new Employee("James", "IT", 13000);
        Employee myra = new Employee("Myra", "IT", 15000);
        Employee john2 = new Employee("John", "IT", 15000);

        set.add(john);
        set.add(james);
        set.add(myra);
        set.add(john2);
        System.out.println(set);
        
    }
}
