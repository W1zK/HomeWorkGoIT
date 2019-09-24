import java.util.Scanner;

public class MainCalc {
    static final char[] pool = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static String decimalConvert(int value, int system) {
        String x = "";
        int a;
        while (value > 0) {
            a = value % system;
            x = pool[a] + x;
            value /= system;
        }
        return x;
    }

    static void show(int userNumber) {
        System.out.print("Binary system:\t" + decimalConvert(userNumber, 2) + "\n"
                + "Octal system:\t" + decimalConvert(userNumber, 8) + "\n"
                + "Hex system:\t\t" + decimalConvert(userNumber, 16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userNumber = scanner.nextInt();

        show(userNumber);
    }
}