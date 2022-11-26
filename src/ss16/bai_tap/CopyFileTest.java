package ss16.bai_tap;

import java.io.*;

public class CopyFileTest {
    public static final String FILE_NAME = "src/ss17/bai_tap/sourtFile.csv";
    public static final String FILE_COPY = "src/ss17/bai_tap/copy.csv";

    public static void main(String[] args) {


        int sum = 0;
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader(FILE_NAME);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(FILE_COPY, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                System.out.println(line);
                sum += CopyFileTest.countString(line);


            }
            bufferedWriter.flush();
            System.out.println(" Số ký tự trong mã nguồn " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static int countString(String str) {
        int count = 0;
        String[] array = str.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(" ")) {
                count++;
            }
        }
        return array.length - count;

    }

}
