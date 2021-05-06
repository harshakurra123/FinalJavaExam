/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Harshavardhan Kurra
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 12: Harshavardhan Kurra");
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(111, "harsha", 79789));
        arrayList.add(new Employee(222, "vardhan", 667573));
        arrayList.add(new Employee(333, "kurra", 746756));
        arrayList.add(new Employee(444, "ratna", 346877));
        arrayList.add(new Employee(555, "siva", 654767));
        
        System.out.println("original arraylist");
        for (Employee employeeRecord : arrayList) {
            System.out.println(employeeRecord);
        }
        
        Collections.sort(arrayList);
        System.out.println("sorted arraylist by id");
        for (Employee employeeRecord : arrayList) {
            System.out.println(employeeRecord);
        }

        Collections.sort(arrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee value1, Employee value2) {
                return Double.compare(value1.getEmpSalary(), value2.getEmpSalary());
            }
        });
        System.out.println("sorted arraylist by salary");
        for (Employee employeeRecord : arrayList) {
            System.out.println(employeeRecord);
        }

        Collections.sort(arrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee value1, Employee value2) {
                return value1.getEmpName().compareTo(value2.getEmpName());
            }
        });
        System.out.println("sorted arraylist by name");
        for (Employee employeeRecord : arrayList) {
            System.out.println(employeeRecord);
        }
    }
    
}
