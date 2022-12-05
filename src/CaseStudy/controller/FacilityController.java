package CaseStudy.controller;

import CaseStudy.model.Facility;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;
import CaseStudy.service.FacilityServiceImpl;
import CaseStudy.service.IFacility;

import java.io.Reader;

public class FacilityController {
    IFacility facilityService = new FacilityServiceImpl();
    public void displayFacility(){
        this.facilityService.display();
    }
    public void addFacility(Facility facility){
        this.facilityService.add(facility);
    }
    public void mentenance(){
        this.facilityService.displayMentenance();
    }
    public void addNewVilla(Villa villa){
        this.facilityService.addVilla(villa);
    }
    public void addNewRoom(Room room){
        this.facilityService.addRoom(room);
    }
}
