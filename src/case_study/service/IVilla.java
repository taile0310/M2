package case_study.service;


import case_study.model.facility.Villa;

public interface IVilla {
    void display(Villa villa);
    void add(Villa villa);
    void delete(Villa villa);
    void edit(Villa villa);

}
