import Workers.FixWorker;
import Workers.Freelance;
import Workers.HoursWorker;
import Workers.Worker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Utilities implements FilePath {
    Scanner scan = new Scanner(System.in);


    void run() {
        doIt();
    }

    void loadCompany() {
        Company.getInstance().setFixedWorker(readFixed(new File(FIXED_WORKER)));
        Company.getInstance().setNonFixWorker(readHoursWorker(new File(NON_FIXED_WORKER)));
        Company.getInstance().setFreelanceWorker(readFreelance(new File(FREELANCE_WORKER)));
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
        HoursWorker[] tmp = Arrays.copyOf(Company.getInstance().getNonFixWorker(), Company.getInstance().getNonFixWorker().length + 1);
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


    private FixWorker[] readFixed(File path) {
        FixWorker[] fromFile = null;
        if (path.exists()) {
            try {
                Scanner scan = new Scanner(path);
                int length = scan.hasNextInt() ? scan.nextInt() : 0;
                String[] employee;
                if (length != 0) {
                    fromFile = new FixWorker[length];
                    for (int i = 0; i < length; i++) {
                        employee = scan.next().split(",");

                        fromFile[i] = new FixWorker(employee[0], employee[1], Float.parseFloat(employee[2]));
                    }
                }
            } catch (FileNotFoundException | NumberFormatException e) {
                System.out.println("File not found. " + e.fillInStackTrace());
                return new FixWorker[0];
            }
        }
        return fromFile;
    }

    private HoursWorker[] readHoursWorker(File path) {
        HoursWorker[] fromFile = null;
        if (path.exists()) {
            try {
                Scanner scan = new Scanner(path);
                int length = scan.hasNextInt() ? scan.nextInt() : 0;
                String[] employee;
                if (length != 0) {
                    fromFile = new HoursWorker[length];
                    for (int i = 0; i < length; i++) {
                        employee = scan.next().split(",");
                        fromFile[i] = new HoursWorker(employee[0], employee[1], Float.parseFloat(employee[2]), Float.parseFloat(employee[3]), Float.parseFloat(employee[4]));
                    }
                }
            } catch (FileNotFoundException | NumberFormatException e) {
                System.out.println("File not found. " + e.fillInStackTrace());
                return new HoursWorker[0];
            }
        }
        return fromFile;
    }

    private Freelance[] readFreelance(File path) {
        Freelance[] fromFile = null;
        if (path.exists()) {
            try {
                Scanner scan = new Scanner(path);
                int length = scan.hasNextInt() ? scan.nextInt() : 0;
                String[] employee;
                if (length != 0) {
                    fromFile = new Freelance[length];
                    for (int i = 0; i < length; i++) {
                        employee = scan.next().split(",");
                        fromFile[i] = new Freelance(employee[0], employee[1], Float.parseFloat(employee[2]), Float.parseFloat(employee[3]));
                    }
                }
            } catch (FileNotFoundException | NumberFormatException e) {
                System.out.println("File not found. " + e.fillInStackTrace());
                return new Freelance[0];
            }
        }
        return fromFile;
    }

    private void saveCompanyInFile() {
        fixWorkerSave(Company.getInstance().getFixedWorker(), new File(FIXED_WORKER));
        hoursWorkerSave(Company.getInstance().getNonFixWorker(), new File(NON_FIXED_WORKER));
        freelanceSave(Company.getInstance().getFreelanceWorker(), new File(FREELANCE_WORKER));
    }


    private void fixWorkerSave(FixWorker[] fixWorkers, File path) {
        creatFile(path);
        try {
            FileWriter writer = new FileWriter(path);
            writer.flush();
            writer.write(fixWorkers.length + "\n");
            for (FixWorker w : fixWorkers) {
                writer.write(w.getFirstName() + "," + w.getSecondName() + "," + w.getPayment() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Файл не записан!" + e.toString());
        }
    }

    private void hoursWorkerSave(HoursWorker[] hoursWorkers, File path) {
        creatFile(path);
        try {
            FileWriter writer = new FileWriter(path);
            writer.flush();
            writer.write(hoursWorkers.length + "\n");
            for (HoursWorker h : hoursWorkers) {
                writer.write(h.getFirstName() + "," + h.getSecondName() + "," + h.getHours() + ","
                        + h.getDays() + "," + h.getPrice() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Файл не записан!" + e.toString());
        }
    }

    private void freelanceSave(Freelance[] freelance, File path) {
        creatFile(path);
        try {
            FileWriter writer = new FileWriter(path);
            writer.flush();
            writer.write(freelance.length + "\n");
            for (Freelance f : freelance) {
                writer.write(f.getFirstName() + "," + f.getSecondName() + "," + f.getHours() + ","
                        + f.getPrice() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: file hasn't been written!" + e.toString());
        }
    }


    private void creatFile(File path) {
        try {
            path.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showInfo() {
        System.out.println(InfoServices.infoWorkers(Company.getInstance().getFixedWorker()));
        System.out.println(InfoServices.infoWorkers(Company.getInstance().getNonFixWorker()));
        System.out.println(InfoServices.infoWorkers(Company.getInstance().getFreelanceWorker()));

    }

    private String payment() {
        float pay = InfoServices.paymentCalc(Company.getInstance().getFixedWorker()) +
                InfoServices.paymentCalc(Company.getInstance().getNonFixWorker()) +
                InfoServices.paymentCalc(Company.getInstance().getFreelanceWorker());


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
            for (int i = allWorker.length - 1; i >=0; i--) {
                System.out.println(allWorker[i].toString());

            }
        }




        /*Worker tmp;
        for (int i = 0; i < allWorker.length - 1; i++) {
            for (int j = i; j < allWorker.length - (i + 1); j++) {
                if (allWorker[j].payCalc() > allWorker[j + 1].payCalc()) {
                    tmp = allWorker[j];
                    allWorker[j] = allWorker[j + 1];
                    allWorker[j + 1] = tmp;
                }
            }

            for (int j = all.length - (i + 2); j > i; j--) {
                if (all[j - 1].salaryCalc() > all[j].salaryCalc()) {
                    tmp = all[j];
                    all[j] = all[j - 1];
                    all[j - 1] = tmp;
                }
            }
        }*/


    }


}
