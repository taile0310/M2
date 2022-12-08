package case_study.character;

import case_study.model.Facility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

public interface IFileMapFacility {
    LinkedHashMap<Facility, Integer> readFacility(String pathFile) throws IOException;

    void writeFacility(String pathFile, LinkedHashMap<Facility, Integer> facility);

}

