package case_study.service;


import case_study.model.facility.Room;

public interface IRoom {
    void display(Room room);
    void add(Room room);
    void delete(Room room);
    void edit(Room room);
}
