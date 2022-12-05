package CaseStudy.model;

public class Villa extends Facility{
    private String roomStandard;
    private Double poolArea;
    private int numOfFloors;

    public Villa() {
    }

    public Villa(String serviceName, Double usableArea, Double rentCost, int numOfPeople, String rentalType, String roomStandard, Double poolArea, int numOfFloors) {
        super(serviceName, usableArea, rentCost, numOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfFloors = numOfFloors;
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numOfFloors=" + numOfFloors + '\'' + super.toString() +
                '}';
    }
}
