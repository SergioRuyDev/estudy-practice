package leetcode;

public class PalindromeStudy {

    public static void main(String[] args) {

        String racecar = "Racecar";
        String racecar2 = "A man, a plan, a canal: Panama";
//        String sergio = "Sergio";
////        sergio.
//
//        int tres = 3;
//        System.out.println(sergio.substring(0, tres - 1));
//
//        isPalindrome(racecar);
//        System.out.println(isPalindrome(sergio));
//        System.out.println(isPalindrome(racecar));
//
//        System.out.println(isPalindromeForceBrute(racecar));
//        System.out.println(isPalindromeForceBrute(sergio));

//        System.out.println(isPalindromeForceBrute(racecar2));
        System.out.println(isPalindrome(racecar2));

    }

    public static boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            // Ignorar caracteres não alfanuméricos e considerar apenas letras e números
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            // Ignorar caracteres não alfanuméricos e considerar apenas letras e números
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            // Comparar caracteres em minúsculas para evitar diferenças de case
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;

            }

            //movimento dos 2 ponteiros
            start++;
            end--;

        }
        return true;
    }

    public static boolean isPalindromeForceBrute(String s) {
        StringBuilder clean = new StringBuilder();
        // clean the string/ convert the string s into array of chars char[]
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {

                // Verifica se o caractere é uma letra (a-z ou A-Z) ou um número (0-9).
                //Se não for (ex: espaço ' ', vírgula ',', exclamação '!'), ignora (não entra no append).
                clean.append(Character.toLowerCase(c));
                // Se for uma letra ou número, adiciona no StringBuilder clean, mas sempre em minúsculo.
                //Assim, 'A' vira 'a', 'M' vira 'm', etc.
            }
        }

        String cleanedString = clean.reverse().toString();

        // reverse cleaned string
//        String reversed = clean.reverse().toString();


        return cleanedString.equals(cleanedString);
    }

    public static boolean isIntPalindrome(int x) {

        // Se x for negativo, já retornamos false, pois números negativos não podem ser palíndromos (-121 ≠ 121-).
        //Se x termina em 0 e não for 0, também retornamos false (10, 100 nunca podem ser palíndromos).
        //  Por quê? Um número palíndromo começa e termina com o mesmo dígito.
        //  Se x termina em 0, ele também precisaria começar com 0, o que só é possível se x == 0.

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            // atribui o ultimo digito a variavel reversedHalf
            reversedHalf = reversedHalf * 10 + x % 10;

            // remove o ultimo digito a cada iteração, até que X se torna menor ou igual a reversedHalf.
            x /= 10;


        }

        //Agora verificamos se x e reversedHalf representam metades iguais do número.
        //📌 Se o número tem um número par de dígitos, basta verificar x == reversedHalf:
        //Exemplo: 1221 → 12 == 12 ✅
        //📌 Se o número tem um número ímpar de dígitos, reversedHalf tem um dígito a mais, então removemos ele (/10):
        //Exemplo: 12321 → 12 == 123 / 10 (12) ✅
        return x == reversedHalf || x == reversedHalf / 10;
    }

}
