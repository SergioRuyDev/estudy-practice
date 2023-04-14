package educativeOOP;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle obj = new Rectangle(2,2);
        System.out.println("The area of rectangle is: " + obj.getArea());


    }
}
