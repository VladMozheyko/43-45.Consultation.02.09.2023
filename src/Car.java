public class Car {
    private int speed;
    private double price;
    private String brand;


    public Car(int speed, double price, String brand) {
        this.speed = speed;
        this.price = price;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}' + "\n";
    }
}
