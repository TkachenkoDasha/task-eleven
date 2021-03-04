package task4;

public class Car {
    private int id;
    private double price;
    private String color;
    private int yearOfIssue;

    public Car(int id, double price, String color, int yearOfIssue) {
        this.id = id;
        this.price = price;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car {" +
                "id=" + id +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
