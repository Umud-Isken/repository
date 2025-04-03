package Lesson37_hometask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("UJIK89O", 232342);
        Employee employee2 = new Employee("UJIK891", 23423);
        Employee employee3 = new Employee("UJIK892", 3453);
        
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees);
     
        Collections.sort(employees);


        System.out.println(employees);
    }
}