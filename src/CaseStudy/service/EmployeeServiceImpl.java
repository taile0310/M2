package CaseStudy.service;

import CaseStudy.model.Employee;


import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployee {
    private static final List<Employee> employeeList = new ArrayList<>();
    
    @Override
    public List<Employee> display(Employee employee) {
        return EmployeeServiceImpl.employeeList;
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        for (Employee employee1 : employeeList) {
            if (employee1.getIdentityCard() == employee.getIdentityCard()) {
                employeeList.remove(employee);
                break;
            }
        }
    }

    @Override
    public void edit(Employee employee) {
        for (Employee employee1 : employeeList) {
            employee1.setId(employee.getId());;
            employee1.setIdentityCard(employee.getIdentityCard());
            employee1.setName(employee.getName());
            break;
        }
    }
}
