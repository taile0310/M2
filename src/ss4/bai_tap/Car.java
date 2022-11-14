package ss4.bai_tap;

public class Car {
    public String name;
    public double speed;
    public double weigth;
    public double price;

//    get và set quản lý khi người dùng nhập vào


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String name, double speed, double weigth, double price)
//    quản lý hệ thống
    {
        this.name = name;

        if (speed > 0 && weigth > 0 && price > 0){
            this.speed = speed;
            this.weigth = weigth;
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", weigth=" + weigth +
                ", price=" + price +
                '}';
    }
}
