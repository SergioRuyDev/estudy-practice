package educativeOOP;

public class CalculateConstructor {
    static class Calculator {
        private double num1;
        private double num2;

        public Calculator(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        double add() {
            return this.num1 + this.num2;
        }

        double subtract() {
            return this.num2 - this.num1;
        }

        double multiply() {
            return this.num1 * this.num2;
        }

        double divide() {
            return this.num2 / this.num1;
        }
    }


    public static void main(String[] args) {
        Calculator obj = new Calculator(10, 94);

        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }

}
