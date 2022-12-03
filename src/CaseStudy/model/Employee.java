package CaseStudy.model;

public class Employee extends Person {
    private String level;
    private String location;
    private Double wage;



    public Employee() {

    }

    public Employee(int id, String name, String dateOfBirth, String gender, int identityCard, int phone, String mail, String level, String location, Double wage) {
        super(id, name, dateOfBirth, gender, identityCard, phone, mail);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage + super.toString() +
                '}';
    }
}
