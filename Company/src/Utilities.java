import Workers.FixWorker;
import Workers.Freelance;
import Workers.HoursWorker;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Utilities implements FilePath {
    Scanner scan = new Scanner(System.in);
    //private Company company;

    void run(){
        loadCompany();
        addFreelance();
    }


    private void addHourly() {
        HoursWorker[] tmp = Arrays.copyOf(Company.getInstance().getNonFixWorker(), Company.getInstance().getNonFixWorker().length + 1);
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
        tmp[tmp.length - 1] = new HoursWorker(firstName,secondName,day,time,timePrice);
        Company.getInstance().setNonFixWorker(tmp);
    }

    private void addFixed() {
        FixWorker[] tmp = Arrays.copyOf(Company.getInstance().getFixedWorker(), Company.getInstance().getFixedWorker().length + 1);
        System.out.println("Введите имя сотрудника: ");
        String firstName = scan.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scan.nextLine();
        System.out.println("Введите ЗП: ");
        float pay = scan.nextFloat();
        tmp[tmp.length - 1] = new FixWorker(firstName, secondName, pay);
        Company.getInstance().setFixedWorker(tmp);
    }

    private void addFreelance(){
        Freelance[] tmp = Arrays.copyOf(Company.getInstance().getFreelanceWorker(), Company.getInstance().getFreelanceWorker().length + 1);
        System.out.println("Введите имя сотрудника: ");
        String firstName = scan.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scan.nextLine();
        System.out.println("Введите количество часов: ");
        float time = scan.nextFloat();
        System.out.println("Введите цену часа: ");
        float timePrice = scan.nextFloat();
        tmp[tmp.length-1] = new Freelance(firstName,secondName,time,timePrice);
        Company.getInstance().setFreelanceWorker(tmp);

    }



    private void loadCompany() {
        Company.getInstance().setFixedWorker(readFixed(new File(FIXED_WORKER)));
        Company.getInstance().setNonFixWorker(readHoursWorker(new File(FilePath.NON_FIXED_WORKER)));
        Company.getInstance().setFreelanceWorker(readFreelance(new File(FilePath.FREELANCE_WORKER)));
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
                        fromFile[i] = new HoursWorker(employee[0], employee[1],Float.parseFloat(employee[2]),Float.parseFloat(employee[3]),Float.parseFloat(employee[4]));
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
                        fromFile[i] = new Freelance(employee[0], employee[1],Float.parseFloat(employee[2]),Float.parseFloat(employee[3]));
                    }
                }
            } catch (FileNotFoundException | NumberFormatException e) {
                System.out.println("File not found. " + e.fillInStackTrace());
                return new Freelance[0];
            }
        }
        return fromFile;
    }

    private void saveCompany() {
        saveFixed(company.getFixedRateEmployee(), new File(Files.FIXED_SALARY_EMPLOEE));
        saveNonFixed(company.getNonFixRateEmployee(), new File(Files.NON_FIXED_SALARY_EMPLOEE));
        saveFrilance(company.getFrilanceEmployee(), new File(Files.FRILANCE_SALARY_EMPLOEE));
    }



}
