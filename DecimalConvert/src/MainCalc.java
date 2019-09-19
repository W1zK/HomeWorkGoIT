import java.util.Scanner;

public class MainCalc {
    static char[] pool = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static int userNumber;
    static int a;

    static String decimalConvert(int value, int system) {
        String x = "";
        while (value > 0) {
            a = value % system;
            x = pool[a] + x;
            value /= system;
        }
        return x;
    }

    static void show() {
        System.out.print("Binary system:" + decimalConvert(userNumber, 2) + "\n"
                        + "Octal system:" + decimalConvert(userNumber, 8) + "\n"
                        + "Hex system:" + decimalConvert(userNumber, 16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        userNumber = scanner.nextInt();

        show();
    }
}