package case_study.service.Impl;

import case_study.model.facility.Room;
import case_study.service.IRoom;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements IRoom {
    private static final List<Room> roomList = new ArrayList<>();
    @Override
    public void display(Room room) {
        for (Room ro :roomList) {
            System.out.println(ro);
        }
    }

    @Override
    public void add(Room room) {
        roomList.add(room);

    }

    @Override
    public void delete(Room room) {
        Room deleteRoom = null;
        for (Room ro : roomList) {
            if (ro.getServiceName() == room.getServiceName()) {
                deleteRoom = ro;
                break;
            }
        }
        if (deleteRoom != null){
            roomList.remove(deleteRoom);
        }
    }

    @Override
    public void edit(Room room) {
        for (Room ro : roomList) {
            ro.setFreeService(room.getFreeService());
            ro.setNumOfPeople(room.getNumOfPeople());
            ro.setServiceName(room.getServiceName());
            break;
        }

    }
}
