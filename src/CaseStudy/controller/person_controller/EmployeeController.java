package CaseStudy.controller.person_controller;

import CaseStudy.model.person.Employee;
import CaseStudy.service.Impl.EmployeeServiceImpl;
import CaseStudy.service.IEmployee;

public class EmployeeController {
    IEmployee employeeService = new EmployeeServiceImpl();

    public void displayEmployee(Employee employee){
        this.employeeService.display(employee);
    }

    public void addEmployee(Employee employee) {
        this.employeeService.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        this.employeeService.delete(employee);
    }

    public void editEmployee(Employee employee) {
        this.employeeService.edit(employee);
    }
}
