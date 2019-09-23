import java.util.Scanner;

public class Fifth {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число X:");
        int x = scanner.nextInt();
        recurs(x);
    }

    private static void recurs(int input) {
        if (input != 1) {
            recurs(input - 1);
        }
        System.out.print(input + " ");
    }
}
