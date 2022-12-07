package case_study.character;

import case_study.model.person.Customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IFileListCustomer {
    List<Customer> readFileCustomer(String pathFile) throws IOException;

    void writeFileCustomer(String pathFile, List<Customer> customers) throws IOException;
}
