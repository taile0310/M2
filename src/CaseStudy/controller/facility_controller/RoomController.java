package CaseStudy.controller.facility_controller;

import CaseStudy.model.facility.Room;
import CaseStudy.service.IRoom;
import CaseStudy.service.Impl.RoomServiceImpl;

public class RoomController {
    IRoom iRoom = new RoomServiceImpl();

    public void displayRoom(Room room) {
        this.iRoom.display(room);
    }

    public void addRoom(Room room) {
        this.iRoom.add(room);
    }

    public void deleteRoom(Room room) {
        this.iRoom.delete(room);
    }

    public void editRoom(Room room) {
        this.iRoom.edit(room);
    }
}
