package CaseStudy.service;

import CaseStudy.model.Employee;

public interface IEmployee {
    void display();
    void add(Employee employee);
    void delete(Employee employee);
    void edit();

}
