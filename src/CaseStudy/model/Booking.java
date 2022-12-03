package CaseStudy.model;

public class Booking {
    private int idBooking;
    private String startDay;
    private String endDay;
    private int customerId;
    private String serviceName;

    public Booking() {
    }

    public Booking(int idBooking, String startDay, String endDay, int customerId, String serviceName) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.serviceName = serviceName;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerId=" + customerId +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
