package case_study.service;

import case_study.model.person.Employee;

import java.io.IOException;

public interface IEmployee {
    void display() throws IOException;
    void add(Employee employee) throws IOException;
    void delete(Employee employee ) throws IOException;
    void edit( Employee employee) throws IOException;

}
