import Workers.FixWorker;
import Workers.Freelance;
import Workers.HoursWorker;
import Workers.Worker;


import java.util.Arrays;
import java.util.Scanner;


public class Utilities implements FilePath, InfoServices, FileHandler {
    {
        loadCompany();
    }

    Scanner scan = new Scanner(System.in);


    void run() {
        doIt();
    }

    private void doIt() {
        System.out.print("\n1 - Добавление сотрудников" +
                "\n2 - Информация о сотрудниках" +
                "\n3 - Затраты на сотрудников" +
                "\n4 - Сортировка" +
                "\n5 - Обратная сортировка");

        System.out.println("Ввод: ");

        int y = scan.nextInt();
        switch (y) {
            case 1:
                addWorker();
                break;
            case 2:
                showInfo();
                repeet();
                break;
            case 3:
                System.out.println(payment());
                repeet();
                break;
            case 4:
                sorting(true);
                repeet();
                break;
            case 5:
                sorting(false);
                repeet();
                break;
            default: {
                System.out.println("Вы ввели не верное значение");
                break;
            }
        }

    }

    private void addWorker() {
        System.out.println("\n 1 - Рабочий с фиксированой З/П" +
                "\n 2 - Рабочий с почасовой З/П" +
                "\n 3 - Фрилансер");

        System.out.print("\t Ваш вибір: ");
        int x = scan.nextInt();
        switch (x) {
            case 1: {
                addFixedWorker();
                repeet();
                break;
            }
            case 2: {
                addHoursWorker();
                repeet();
                break;
            }
            case 3: {
                addFreelance();
                repeet();
                break;
            }
            default: {
                System.out.println("Вы ввели не верное значение");
                break;
            }
        }
    }

    private void addHoursWorker() {
        scan.nextLine();
        System.out.println("Введите имя сотрудника: ");
        String firstName = scan.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scan.nextLine();
        System.out.println("Введите количество рабочих дней: ");
        float day = scan.nextFloat();
        System.out.println("Введите количество часов: ");
        float time = scan.nextFloat();
        System.out.println("Введите цену часа: ");
        float timePrice = scan.nextFloat();
        HoursWorker[] tmp = Arrays.copyOf(Company.getInstance().getNonFixWorker(), Company.getInstance().getNonFixWorker().length + 1);
        tmp[tmp.length - 1] = new HoursWorker(firstName, secondName, day, time, timePrice);
        Company.getInstance().setNonFixWorker(tmp);
    }

    private void addFixedWorker() {
        FixWorker[] tmp = Arrays.copyOf(Company.getInstance().getFixedWorker(), Company.getInstance().getFixedWorker().length + 1);
        scan.nextLine();
        System.out.println("Введите имя сотрудника: ");
        String firstName = scan.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scan.nextLine();
        System.out.println("Введите ЗП: ");
        float pay = scan.nextFloat();
        tmp[tmp.length - 1] = new FixWorker(firstName, secondName, pay);
        Company.getInstance().setFixedWorker(tmp);
    }

    private void addFreelance() {
        Freelance[] tmp = Arrays.copyOf(Company.getInstance().getFreelanceWorker(), Company.getInstance().getFreelanceWorker().length + 1);
        scan.nextLine();
        System.out.println("Введите имя сотрудника: ");
        String firstName = scan.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scan.nextLine();
        System.out.println("Введите количество часов: ");
        float time = scan.nextFloat();
        System.out.println("Введите цену часа: ");
        float timePrice = scan.nextFloat();
        tmp[tmp.length - 1] = new Freelance(firstName, secondName, time, timePrice);
        Company.getInstance().setFreelanceWorker(tmp);

    }

    private void showInfo() {
        System.out.println(infoWorkers(Company.getInstance().getFixedWorker()));
        System.out.println(infoWorkers(Company.getInstance().getNonFixWorker()));
        System.out.println(infoWorkers(Company.getInstance().getFreelanceWorker()));

    }

    private String payment() {
        float pay = paymentCalc(Company.getInstance().getFixedWorker()) +
                paymentCalc(Company.getInstance().getNonFixWorker()) +
                paymentCalc(Company.getInstance().getFreelanceWorker());
        return "Затраты на зарплаты " + pay + " $";
    }

    private void repeet() {
        String yes = "y";
        String no = "n";
        System.out.println("\nПродолжить?" +
                "\n(y)YES или (n)NO");
        String question = scan.next();
        if (question.equals(yes)) {
            doIt();
        } else if (question.equals(no)) {
            System.out.println("Сохраняю компанию");
            saveCompanyInFile();
            System.out.println("Спасибо");

        } else {
            System.out.println("Введите другую букву: ");
            repeet();
        }
    }

    private void sorting(boolean s) {
        int length = Company.getInstance().fixedWorker.length + Company.getInstance().nonFixWorker.length + Company.getInstance().freelanceWorker.length;

        Worker[] allWorker = new Worker[length];
        for (int i = 0, j = 0, k = 0, l = 0; i < allWorker.length; i++) {
            if (i < Company.getInstance().fixedWorker.length) {
                allWorker[i] = Company.getInstance().fixedWorker[j];
                j++;
            } else if (i < Company.getInstance().fixedWorker.length + Company.getInstance().nonFixWorker.length) {
                allWorker[i] = Company.getInstance().nonFixWorker[k];
                k++;
            } else {
                allWorker[i] = Company.getInstance().freelanceWorker[l];
                l++;
            }

        }
        int size = allWorker.length;
        int x = size - 1;
        boolean swap = true;
        Worker temp;

        while (swap) {
            swap = false;

            for (int i = x; i > size - 1 - x; i--) {
                if (allWorker[i].payCalc() < allWorker[i - 1].payCalc()) {
                    temp = allWorker[i];
                    allWorker[i] = allWorker[i - 1];
                    allWorker[i - 1] = temp;
                    swap = true;
                }
            }


            for (int i = size - x; i < x; i++) {
                if (allWorker[i].payCalc() > allWorker[i + 1].payCalc()) {
                    temp = allWorker[i];
                    allWorker[i] = allWorker[i + 1];
                    allWorker[i + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }

        }

        if (s) {
            for (Worker workers : allWorker) {
                System.out.println(workers.toString());

            }
        } else {
            for (int i = allWorker.length - 1; i >= 0; i--) {
                System.out.println(allWorker[i].toString());

            }
        }


    }


}
