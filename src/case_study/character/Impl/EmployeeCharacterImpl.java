package case_study.character.Impl;

import case_study.character.IFileListEmployee;
import case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCharacterImpl implements IFileListEmployee {
    @Override
    public List<Employee> readFileEmployee(String pathFile) throws IOException {
        List<Employee> employees = new ArrayList<>();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                        Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
                employees.add(employee);
            }
            bufferedReader.close();
            return employees;
    }




    @Override
    public void writeFileEmployee(String pathFile, List<Employee> employees) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile));
        for (Employee employee : employees) {
            bufferedWriter.write(employee.formatCSVEmployee());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
