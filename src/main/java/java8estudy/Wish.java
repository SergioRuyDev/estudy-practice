package java8estudy;

public class Wish {

    public static void wellWisher(LambdaExe greeting) {
        greeting.greeting();
    }

    public static void main(String[] args) {

        wellWisher(() -> System.out.println("Namaste"));
    }
}
