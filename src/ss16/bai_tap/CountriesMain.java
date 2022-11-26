package ss16.bai_tap;
import java.util.ArrayList;

import java.util.List;
public class CountriesMain {
    public static final String FILE="src/ss17/bai_tap_2/CountryFile";
    public static void main(String[] args) {
        Countries countries=new Countries("VN", "Việt Nam ",1);
        Countries countries1=new Countries("TQ", "Trung Quốc ",2);
        Countries countries2=new Countries("HQ", "Hàn Quốc ",3);
        Countries countries3=new Countries("E", "Anh ",4);
        Countries countries4=new Countries("USA", "Mỹ",5);
        List<Countries> list= new ArrayList<>();
        list.add(countries);
        list.add(countries1);
        list.add(countries2);
        list.add(countries3);
        list.add(countries4);

        for (Countries C:list) {
            String line = C.toString();
            FileUtils.writeFile(FILE, line);

        }List<String> listCountry=FileUtils.readFile(FILE);
        for (int i = 0; i < listCountry.size(); i++) {
            System.out.println(listCountry.get(i));
        }


    }
}
