import java.util.Scanner;

public class Seventh {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean rerun = true;

    public static void main(String[] args) {

        while (rerun) {
            rerun = false;
            System.out.println("1 - считает в консоли до числа Х" +
                    "\n2 - drawRectangle рисует прямоугольник" +
                    "\n3 - перегрузка задания №2" +
                    "\n4 - функция getMax(int,float)" +
                    "\n5 - рекурсия, задание №1" +
                    "\n6 - рекурсия, задание №2");
            System.out.print("Выберите задание из списка:");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    First.main();
                    repeet();
                    break;
                case 2:
                    Second.main();
                    repeet();
                    break;
                case 3:
                    Third.main();
                    repeet();
                    break;
                case 4:
                    Fourth.main();
                    repeet();
                    break;
                case 5:
                    Fifth.main();
                    repeet();
                    break;
                case 6:
                    Sixth.main();
                    repeet();
                    break;
                default:
                    System.out.println("Вы ввели не верный номер задания, повторите ввод!");


            }
        }
    }
    private static void repeet(){
        String yes = "y";
        String no = "n";
        rerun = false;
        System.out.println("\nПродолжить?"+
                            "\n(y)YES или (n)NO");
        String question = scanner.next();
        if (question.equals (yes)) {
            rerun = true;
        } else if (question.equals(no)) {
            System.out.println("Спасибо");
        } else {
            System.out.println("Вы ввели не допустимый символ, повторите ввод.");
            repeet();
        }
    }


}

