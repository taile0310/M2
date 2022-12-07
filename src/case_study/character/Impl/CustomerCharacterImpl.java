package case_study.character.Impl;

import case_study.character.IFileListCustomer;
import case_study.model.person.Customer;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerCharacterImpl implements IFileListCustomer {
    @Override
    public List<Customer> readFileCustomer(String pathFile) throws IOException {
        List<Customer> customers = new ArrayList<>();
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] arr = line.split(",");
            Customer customer = new Customer(Integer.parseInt(arr[0]),arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], Integer.parseInt(arr[7]), arr[8], arr[9]);
            customers.add(customer);
        }
        bufferedReader.close();
        return customers;
    }

    @Override
    public void writeFileCustomer(String pathFile, List<Customer> customers) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : customers) {
            bufferedWriter.write(customer.formatCSVCustomer());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
