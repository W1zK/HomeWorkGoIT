import java.util.Scanner;


public class Main implements MathDo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выбор действия над числами А и В: "
                + "\nA+B '+'"
                + "\nA-B '-'"
                + "\nA*B '*'"
                + "\nA/B '/'"
                + "\nA%B '%'"
                + "\nA==B '=='"
                + "\nA>B '>'"
                + "\nA<B '<'");
        String oper = scanner.nextLine();
        input(oper);

    }

    private static void input(String init) {
        System.out.println("Enter 'A'");
        double a = scanner.nextDouble();
        System.out.println("Enter 'B'");
        double b = scanner.nextDouble();


        switch (init) {
            case "+":
                MathDo.plus(a, b);
                break;
            case "-":
                MathDo.minus(a, b);
                break;
            case "*":
                MathDo.multiplication(a, b);
                break;
            case "/":
                MathDo.division(a, b);
                break;
            case "%":
                MathDo.modulo(a, b);
                break;
            case "==":
                MathDo.equally(a, b);
                break;
            case ">":
                MathDo.aMoreThan(a, b);
                break;
            case "<":
                MathDo.bMoreThan(a, b);


        }

    }


}
