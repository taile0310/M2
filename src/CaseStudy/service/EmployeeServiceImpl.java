package CaseStudy.service;

import CaseStudy.model.Employee;


import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployee {
    private static final List<Employee> employeeList = new ArrayList<>();

    @Override
    public void display(Employee employee) {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        Employee deleteEmp = null;
        for (Employee employee1 : employeeList) {
            if (employee.getIdentityCard() == employee1.getIdentityCard()) {
                deleteEmp = employee1;
                break;
            }
        }
        if (deleteEmp == null){
            employeeList.remove(deleteEmp);
        }
    }

    @Override
    public void edit(Employee employee) {
        for (Employee employee1 : employeeList) {
            employee1.setId(employee.getId());
            employee1.setIdentityCard(employee.getIdentityCard());
            employee1.setName(employee.getName());
            break;
        }
    }
}
