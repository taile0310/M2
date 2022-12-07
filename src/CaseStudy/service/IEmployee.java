package CaseStudy.service;

import CaseStudy.model.person.Employee;

public interface IEmployee {
    void display(Employee employee);
    void add(Employee employee);
    void delete(Employee employee );
    void edit( Employee employee);

}
