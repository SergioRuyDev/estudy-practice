package algaworks;

public class WhileExercise {

    static final Integer DIVISOR = 3;

    public static void main(String[] args) {

        // algaworks.For is when you know how many times you need the repetition. While is for when you don't know.
        //While is more for conditions.

//        int i = 0;
//        while (i < 10) {
//            i++;
//            System.out.println("some phrase.");
//
//        }

//        int i = 0;
//        while (i < 10) {
//            if (i ==  5) {
//                System.out.println("Will continue.");
//                i++;
//                continue;
//            }
//            System.out.println(i + ": some phrase.");
//            i++;
//        }

        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int i = 0;
        while (i < numeros.length) {
            Integer numero = numeros[i];
            Integer moduloPorTres = numero % DIVISOR;

            if (moduloPorTres.equals(0)) {
                System.out.println(numero + ": É divisivel por 3.");
            }

            i++;
        }
        System.out.println("Fim.");
    }
}
