package CaseStudy.cotroller;

import CaseStudy.model.Employee;
import CaseStudy.service.EmployeeServiceImpl;
import CaseStudy.service.IEmployee;

public class EmployeeController {
    IEmployee employeeService = new EmployeeServiceImpl();

    public void displayEmployee(){
        this.employeeService.display();
    }

    public void addEmployee(Employee employee) {
        this.employeeService.add(employee);
    }

    public void deleteEmployee() {
        this.employeeService.delete();
    }

    public void editEmployee() {
        this.employeeService.edit();
    }
}
