package DSA.Hashing;

import java.util.Objects;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + ", Department : " + this.department + ", Salary : " + this.salary + "\n";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Employee e = (Employee) o;
        return this.name.equals((e.name)) && this.department.equals(e.department);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.department);
    }
}
