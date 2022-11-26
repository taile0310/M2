package ss16.bai_tap.bai1;

public class Countries {
    private String code;
    private String name;
    private int id;

    public Countries() {
    }

    public Countries(int id) {
        this.id = id;
    }

    public Countries(String code, String name, int id) {
        this.code = code;
        this.name = name;
        this.id = id;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
