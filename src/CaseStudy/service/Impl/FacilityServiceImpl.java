package CaseStudy.service.Impl;

import CaseStudy.model.Facility;
import CaseStudy.model.facility.Room;
import CaseStudy.model.facility.Villa;
import CaseStudy.service.IFacility;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements IFacility {
    private static final LinkedHashMap<Facility, Integer> facilitiList = new LinkedHashMap<>();

    static {
        Villa villa = new Villa("Villa", 30.2, 100.0, 5, "Day", "Vip", 30.0, 1);
        facilitiList.put(villa, 5);

        Room room = new Room("Room", 15.0, 50.0, 3, "gold", "normal");
        facilitiList.put(room, 5);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> entry : facilitiList.entrySet()) {
            System.out.println(entry);
        }
    }

    @Override
    public void add(Facility facility) {
    }

    @Override
    public void displayMentenance() {
        for (Map.Entry<Facility, Integer> entry : facilitiList.entrySet()) {
            if (entry.getValue() >= 5){
                System.out.println(entry + " " + " cần phải bảo trì");
            }
        }
    }

    @Override
    public void addVilla(Villa villa) {
        facilitiList.put(villa, 0);
    }

    @Override
    public void addRoom(Room room) {
        facilitiList.put(room, 1);
    }
}
