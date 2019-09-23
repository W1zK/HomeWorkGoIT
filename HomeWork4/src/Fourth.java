import java.util.Scanner;

public class Fourth {
    public static void main() {
        int x;
        int y;
        float z;
        float w;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ПАРУ чисел(int или float) которые хотите сравнить:" +
                "\nЧисло №1:");
        String firsNum = scanner.nextLine();
        System.out.println("Число №2:");
        String secondNum = scanner.next();
        if (!firsNum.contains(".") && !secondNum.contains(".")) {
            x = Integer.parseInt(firsNum);
            y = Integer.parseInt(secondNum);
            getMax(x, y);
        } else {
            z = Float.parseFloat(firsNum);
            w = Float.parseFloat(secondNum);
            getMax(z, w);
        }
    }

    private static void getMax(int velue1, int velue2) {

        int max = (velue1 > velue2) ? velue1 : velue2;
        System.out.println(max);
    }

    private static void getMax(float velue1, float velue2) {

        float max = (velue1 > velue2) ? velue1 : velue2;
        System.out.println(max);
    }
}
