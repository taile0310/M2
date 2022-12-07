package CaseStudy.model;

import CaseStudy.view.FacilityView;

public abstract class Facility {
    private String serviceName;
    private Double usableArea;
    private Double rentCost;
    private int numOfPeople;
    private String rentalType;

    protected Facility() {
    }

    protected Facility(String serviceName, Double usableArea, Double rentCost, int numOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.numOfPeople = numOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Double usableArea) {
        this.usableArea = usableArea;
    }

    public Double getRentCost() {
        return rentCost;
    }

    public void setRentCost(Double rentCost) {
        this.rentCost = rentCost;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", numOfPeople=" + numOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return this.serviceName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Facility){
            Facility facility = (Facility) obj;
            if (this.serviceName.equals(facility.serviceName)){
                return true;
            }
        }
        return false;
    }
}
