package case_study.character.Impl;

import case_study.character.IFileMapFacility;
import case_study.model.Facility;
import case_study.model.facility.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class FacilityCharacterImpl implements IFileMapFacility {

    @Override
    public LinkedHashMap<Facility, Integer> readFacility(String pathFile) throws IOException {
        LinkedHashMap<Facility,Integer> linkedHashMap = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] arr = line.split(",");

            Villa villa = new Villa(arr[0],Double.parseDouble(arr[1]),
                    Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),arr[4],
                    arr[5],Double.parseDouble(arr[6]),Integer.parseInt(arr[7]));
//            linkedHashMap.putAll(villa, Integer.parseInt(arr[8]));
        }

        return linkedHashMap;
    }

    @Override
    public void writeFacility(String pathFile, LinkedHashMap<Facility, Integer> facility) {

    }
}
