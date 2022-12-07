package case_study.controller;

import case_study.model.Facility;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.service.Impl.FacilityServiceImpl;
import case_study.service.IFacility;

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
