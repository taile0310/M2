package CaseStudy.service;

import CaseStudy.model.Employee;


import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployee {
    @Override
    public void display() {
        List<Employee> employee = new ArrayList<>();
        for (Employee e: employee) {
            System.out.println(e);
        }
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp :employees) {
            if (emp.getIdentityCard() == employee.getIdentityCard()){
                delete(emp);
                break;
            }
        }
    }

    @Override
    public void edit() {

    }
}
