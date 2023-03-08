public class For {

    public static void main(String[] args) {
//        variavel, condicao e numero de execuçoes
//        (qualquer expressao q retorna um boolean;
//        expressao q vai ser executada após cada volta.

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + ": A phrase.");
//        }

//        Double carrinhoDeCompras = 150.0;
//        Double[] carrinhoDeCompras = new Double[]{ 50.0, 50.0, 50.0 };
//        Double total = 0.0;
//        for (int i = 0; i < carrinhoDeCompras.length; i++) {
//            System.out.println("Iterator: " + i + " , Total: " + total);
//            total = total + carrinhoDeCompras[i];
//        }
//
//        System.out.println(total);
        System.out.println("Largest in given array is " + largest());


    }

    static Integer[] products = new Integer[] { 100, 225, 300 };

    static Integer largest() {
        Integer max = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i] > max)
                max = products[i];
        }
        return max;
    }
}
