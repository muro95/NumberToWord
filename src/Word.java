import java.util.Scanner;
public class Word {
    private static final String [] ONES = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };
    private static final String [] TEENS = {
            "Ten", "Eleven", "Twelve", "Thirteen", null, "Fifteen", null, null, null, null
    };
    private static final String [] TENS = {
            null, null, "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static String convertNumberToWords(int number){
        if (number < 10){
            return ONES[number];
        } else if (number < 20){
            int n = number - 10;
            String words = TEENS[n];
            return words == null ? ONES[n] + "teen" : TEENS[n];
        } else if (number < 100){
            int n = number % 10;
            return TENS[number/10] + (n == 0 ? "" : (" " + convertNumberToWords(n)));
        } else {
            int n = number % 100;
            return ONES[number/100] + " Hundred " + " And " + (n == 0 ? "" : (" " + convertNumberToWords(n)));
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(convertNumberToWords(number));

    }
}
