package educative.methods;

//Write a method showTableOf4() that displays 20 terms from the table of 4. Call your method from the main()
// function to display the results.
public class MultiTable {
    public static void main(String[] args) {

        showTableOf4();
    }

    static void showTableOf4() {
        for(int i = 1; i < 21; i++) {
            System.out.println("4 x " + i + " = " + 4 * i);
        }
    }
}
