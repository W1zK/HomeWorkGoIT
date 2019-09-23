import java.util.Scanner;

public class Sixth {
    private static int y;

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение высоты:");
        int x = scanner.nextInt();
        System.out.print("Введите значение шырины:");
        y = scanner.nextInt();

        draw(x, y);
    }

    private static void draw(int height, int width) {
        if (0 < height && width == 0) {
            width = y;
            System.out.println();
            draw(height - 1, width);

        } else if (height == 0) {

        } else {
            System.out.print("+");
            draw(height, width - 1);
        }
    }
}

