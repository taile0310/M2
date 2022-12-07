package case_study.service;

import case_study.model.Facility;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

public interface IFacility {
    void display();
    void add(Facility facility);
    void displayMentenance();

    void addVilla(Villa villa);
    void addRoom(Room room);
}
