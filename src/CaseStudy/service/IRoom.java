package CaseStudy.service;


import CaseStudy.model.Room;

public interface IRoom {
    void display(Room room);
    void add(Room room);
    void delete(Room room);
    void edit(Room room);
}
