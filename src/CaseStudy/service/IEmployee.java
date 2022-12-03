package CaseStudy.service;

import CaseStudy.model.Employee;

import java.util.List;

public interface IEmployee {
    List<Employee> display(Employee employee);
    void add(Employee employee);
    void delete(Employee employee );
    void edit( Employee employee);

}
