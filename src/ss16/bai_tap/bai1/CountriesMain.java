package ss16.bai_tap.bai1;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
public class CountriesMain {
    public static final String FILE="src/ss16/bai_tap/bai1/CountriesFile";
    public static void main(String[] args) {
        Countries countries=new Countries("VN", "Việt Nam ",1);
        Countries countries1=new Countries("L", "Lào ",2);
        Countries countries2=new Countries("N", "Nhật ",3);
        List<Countries> list= new ArrayList<>();
        list.add(countries);
        list.add(countries1);
        list.add(countries2);

        
        for (Countries C:list) {
            String line = C.toString();
            FileUtils.writeFile(FILE, line);

        }List<String> listCountry=FileUtils.readFile(FILE);
        for (int i = 0; i < listCountry.size(); i++) {
            System.out.println(listCountry.get(i));
        }


    }
}
