package case_study.controller.facility_controller;

import case_study.model.facility.Room;
import case_study.service.IRoom;
import case_study.service.Impl.RoomServiceImpl;

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
