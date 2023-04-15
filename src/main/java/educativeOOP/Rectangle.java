package educativeOOP;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 2);

        System.out.println("The area of the Circle: " + shapes[0].getArea());
        System.out.println("The area of rectangle is: " + shapes[1].getArea());


    }
}
