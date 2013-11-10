import java.util.TreeMap;
import java.util.TreeSet;

public class RomanNumerals {

    public static int[] numbers = { 1, 5, 10, 50 };
    public static String[] romans = { "I", "V", "X", "L" };

    public static String translate(int number) {
        String numberInRoman = "";

        if (number == 0) {
            return "";
        }

        for (int i = 1; i <= 3; ++i) {
            if (number < numbers[i]) {
                return conversion(i, number);
            }
        }

        return numberInRoman;
    }

    private static String conversion(int pos, int number) {
        if( numbers[pos]-number==numbers[0]) {
            return romans[0] + translate(number+1);
        }
        return romans[pos-1] + translate(number - numbers[pos - 1]);
    }
}
