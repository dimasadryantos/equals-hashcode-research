package main;

import java.util.HashSet;

public class main {


    public static void main(String[] args) {
        Employee employee = new Employee("rajeev", 24);

        Employee employee2 = new Employee("rajeev", 25);

        HashSet<Employee> employees = new HashSet<>();
        employees.add(employee);
        employees.add(employee2);

        System.out.println(employees.contains(employee2));

        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode(): " + employee2.hashCode());

        System.out.println(employee.equals(employee));
    }
}
