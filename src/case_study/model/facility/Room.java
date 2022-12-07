package case_study.model.facility;

import case_study.model.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, Double usableArea, Double rentCost, int numOfPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentCost, numOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' + super.toString() +
                '}';
    }
}
