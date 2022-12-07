package case_study.character;

import case_study.model.person.Employee;

import java.io.IOException;
import java.util.List;

public interface IFileListEmployee {

    List<Employee> readFileEmployee(String pathFile) throws IOException;
    void writeFileEmployee(String pathFile, List<Employee> employees) throws IOException;
}
