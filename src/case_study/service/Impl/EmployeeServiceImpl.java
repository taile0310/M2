package case_study.service.Impl;

import case_study.character.Impl.EmployeeCharacterImpl;
import case_study.model.person.Employee;
import case_study.service.IEmployee;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployee {
    private static final String pathFile = "src/case_study/data/employee.csv";
    private final EmployeeCharacterImpl employeeCharacter = new EmployeeCharacterImpl();
    @Override
    public void display() throws IOException {
        List<Employee> employeeList = this.employeeCharacter.readFileEmployee(pathFile);
        System.out.println(employeeList);
    }

    @Override
    public void add(Employee employee) throws IOException {
        List<Employee> employeeList = this.employeeCharacter.readFileEmployee(pathFile);
        employeeList.add(employee);
        this.employeeCharacter.writeFileEmployee(pathFile, employeeList);
    }



    @Override
    public void delete(Employee employee) throws IOException {
        List<Employee> employeeList = this.employeeCharacter.readFileEmployee(pathFile);
        Employee deleteEmp = null;
        for (Employee employee1 : employeeList) {
            if (employee.getIdentityCard() == employee1.getIdentityCard()) {
                deleteEmp = employee1;
                break;
            }
        }
        if (deleteEmp != null) {
            employeeList.remove(deleteEmp);
        }
        this.employeeCharacter.writeFileEmployee(pathFile,employeeList);
    }

    @Override
    public void edit(Employee employee) throws IOException {
        List<Employee> employeeList = this.employeeCharacter.readFileEmployee(pathFile);
        for (Employee employee1 : employeeList) {
            employee1.setName(employee.getName());
            employee1.setWage(employee.getWage());
            employee1.setName(employee.getName());
            break;
        }
        this.employeeCharacter.writeFileEmployee(pathFile, employeeList);
    }
}
