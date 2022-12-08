package case_study.controller.person_controller;

import case_study.model.person.Employee;
import case_study.service.Impl.EmployeeServiceImpl;
import case_study.service.IEmployee;

import java.io.IOException;

public class EmployeeController {

    private final IEmployee employeeService = new EmployeeServiceImpl();

    public void displayEmployee(){
        try {
            this.employeeService.display();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addEmployee(Employee employee) {
        try {
            this.employeeService.add(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(Employee employee) {
        try {
            this.employeeService.delete(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void editEmployee(Employee employee) {
        try {
            this.employeeService.edit(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
