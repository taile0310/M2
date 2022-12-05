package CaseStudy.service;

import CaseStudy.model.Facility;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;

public interface IFacility {
    void display();
    void add(Facility facility);
    void displayMentenance();

    void addVilla(Villa villa);
    void addRoom(Room room);
}
