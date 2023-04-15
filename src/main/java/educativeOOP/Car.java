package educativeOOP;

public class Car extends Vehicle {

    public String name;

    public  Car() {
        name = " ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails(String carName) {
        String details = carName + ", " + getModel() + ", " + getSpeed();
        return details;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getDetails("X"));
    }
}
