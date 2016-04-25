/**
 * Created by lukasmohs on 25/04/16.
 */
public class Parser {
    String[] digits = {"", "ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
    String[] numbersOfTens = { "", "zehn", "zwanwig", "dreißig", "vierzig", "fünzig", "sechzig", "siebzig", "achtzig", "neunzig"};
    String[] numbersFromTenToTwenty = {"zehn", "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn", "zwanzig"};

    public void parse(int number) {
        if(number == 1000000) {
            System.out.print("eine Million");
            return;
        }
        if(number == 0) {
            System.out.print("null");
            return;
        }

        if(number >= 1000) {
            parseNumberBelowThausand(number/1000);
            System.out.print("tausend");
        }
        parseNumberBelowThausand(number%1000);
    }

    private void parseNumberBelowThausand(int number) {
        if(number >= 100) {
            System.out.print(digits[number/100] + "hundert");
            number = number%100;
        }
        if(number <= 10) {
            System.out.print(digits[number]);
        }
        else if(number <= 20){
            System.out.print(numbersFromTenToTwenty[number-10]);
        }
        else {
            System.out.print(digits[number%10] + "und" + numbersOfTens[number/10]);
        }
    }
}
