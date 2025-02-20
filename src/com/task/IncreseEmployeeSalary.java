package com.task;


import java.util.Arrays;
import java.util.List;

public class IncreseEmployeeSalary {
    public static void main(String[] args) {
        List<Employee> employees = getAll();
       employees.stream().map(item -> {
            double percentage = switch (item.getDepartment()) {
                case "IT" -> 0.5;
                case "CS" -> 0.4;
                case "BE" -> 0.3;
                case "BA" -> 0.2;
                case "MA" -> 0.1;
                default -> 0.0;
            };
            item.setSalary(item.getSalary() + (item.getSalary()) * percentage);
            return item;
        }).forEach(System.out::println);
    }


    private static List<Employee> getAll() {
        return Arrays.asList(
                new Employee(1, "Sameer", "IT", 10000),
                new Employee(2, "Arslan", "CS", 8000),
                new Employee(3, "Adil", "BE", 6000),
                new Employee(4, "Aamir", "BA", 4000),
                new Employee(5, "Arshad", "MA", 2000)
        );
    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
