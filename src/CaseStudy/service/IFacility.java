package CaseStudy.service;

import CaseStudy.model.Facility;
import CaseStudy.model.facility.Room;
import CaseStudy.model.facility.Villa;

public interface IFacility {
    void display();
    void add(Facility facility);
    void displayMentenance();

    void addVilla(Villa villa);
    void addRoom(Room room);
}
