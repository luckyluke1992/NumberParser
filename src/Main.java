import java.util.Scanner;

/**
 * Created by lukasmohs on 25/04/16.
 */
public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        int number = 0;

        if(args.length > 0) {
            number = Integer.parseInt(args[0]);
            parser.parse(number);
        }

        while (true) {
            System.out.println("\nHi Patrick, please enter a number to parse! \n number:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            number = Integer.parseInt(input);
            parser.parse(number);
        }

        // 0 - 1 000 000
        // 0 - 19
        // 10, 20, 30
        // 0 - 1000 == 1000 - 1 000 000



    }
}
