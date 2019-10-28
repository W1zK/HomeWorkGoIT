import Categories.*;
import Specific.*;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Store extends AddItems implements Search {
    private Scanner scanner = new Scanner(System.in);
    double wallet = 0;

    @Override
    public void doType(Smartphone[] mass) throws ParseException {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
                repeet();
                break;
            case 3:
                search(mass);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();


        }


    }

    @Override
    public void doType(Computer[] mass) throws ParseException {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
                repeet();
                break;
            case 3:
                search(mass);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();


        }

    }

    @Override
    public void doType(Vagetables[] mass) throws ParseException {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
                repeet();
                break;
            case 3:
                search(mass);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();


        }

    }

    @Override
    public void doType(Candy[] mass) throws ParseException {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
                repeet();
                break;
            case 3:
                search(mass);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();


        }

    }

    @Override
    public void doType(Water[] mass) throws ParseException {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
                repeet();
                break;
            case 3:
                search(mass);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();


        }

    }

    @Override
    public void doType(Soda[] mass) throws ParseException {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
                repeet();
                break;
            case 3:
                search(mass);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();


        }

    }

    @Override
    public void doType(Dress[] mass) throws ParseException {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
                repeet();
                break;
            case 3:
                search(mass);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();


        }

    }

    @Override
    public void addItem(Smartphone[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }
        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter value");
        value = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter description");
        description = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter OS type");
        operationSys = scanner.nextLine();
        System.out.println("Enter RAM size");
        ramSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter RAM type");
        ramType = scanner.nextLine();
        System.out.println("Enter number of core");
        numbCore = scanner.nextInt();
        System.out.println("Enter core frequency");
        freqCore = scanner.nextDouble();
        System.out.println("Enter warranty");
        warranty = scanner.nextInt();
        System.out.println("Enter screen size");
        screenSize = scanner.nextDouble();

        System.out.println("Enter battery life time");
        int battLife = scanner.nextInt();


        smartphones[k] = new Smartphone(Id, name, value, description, price,
                new OperationSystem(operationSys),
                new Ram(ramSize, ramType), new Cpu(numbCore, freqCore),
                new Screen(screenSize),
                new WorkTimeBaterry(battLife),
                new Warranty(warranty));


        System.out.println("++" + k);
        smartphones = Arrays.copyOf(smartphones, smartphones.length + 1);
        System.out.println(smartphones.length);
        System.out.println("Smartphone successfully added to the warehouse");
        System.out.println("---" + smartphones[k].getName() + "---");
        k++;

    }

    @Override
    public void addItem(Computer[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }
        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter value");
        value = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter description");
        description = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter RAM size");
        ramSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter RAM type");
        ramType = scanner.nextLine();
        System.out.println("Enter number of core");
        numbCore = scanner.nextInt();
        System.out.println("Enter core frequency");
        freqCore = scanner.nextDouble();
        System.out.println("Enter Video Card CPU");
        videoCpu = scanner.nextInt();
        System.out.println("Enter video core frequency");
        videoCpuFreq = scanner.nextDouble();
        System.out.println("Enter Video RAM size");
        videoRamSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Video RAM type");
        videoRamType = scanner.nextLine();
        System.out.println("Enter warranty");
        warranty = scanner.nextInt();
        computers[p] = new Computer(Id, name, value, description, price,
                new OperationSystem(operationSys),
                new Ram(ramSize, ramType), new Cpu(numbCore, freqCore),
                new VideoCard(videoCpu, videoCpuFreq),
                new VideoMemory(videoRamSize, videoRamType),
                new Warranty(warranty));

        computers = Arrays.copyOf(computers, computers.length + 1);
        System.out.println("Computer successfully added to the warehouse");
        System.out.println("---" + computers[p].getName() + "---");
        p++;


    }

    @Override
    public void addItem(Vagetables[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }

        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter value");
        value = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter description");
        description = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Variety");
        variety = scanner.nextLine();
        System.out.println("Enter date of manufacture(dd.MM.yyyy)");
        dateIn = scanner.nextLine();
        System.out.println("Enter temperature");
        temperature = scanner.nextDouble();
        System.out.println("Enter experience days");
        expDay = scanner.nextInt();
        vagetables[v] = new Vagetables(Id, name, value, description, price,
                new Variety(variety),
                new ShelfLife(dateIn, temperature, expDay));


        vagetables = Arrays.copyOf(vagetables, vagetables.length + 1);

        System.out.println("Vagetables successfully added to the warehouse");
        System.out.println("---" + vagetables[v].getName() + "---");
        v++;

    }

    @Override
    public void addItem(Candy[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }

        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter value");
        value = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter description");
        description = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter date of manufacture(dd.MM.yyyy)");
        dateIn = scanner.nextLine();
        System.out.println("Enter temperature");
        temperature = scanner.nextDouble();
        System.out.println("Enter experience days");
        expDay = scanner.nextInt();
        candies[c] = new Candy(Id, name, value, description, price,
                new ShelfLife(dateIn, temperature, expDay));
        candies = Arrays.copyOf(candies, candies.length + 1);

        System.out.println("Candies successfully added to the warehouse");
        System.out.println("---" + candies[c].getName() + "---");
        c++;


    }

    @Override
    public void addItem(Water[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }
        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter value");
        value = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter description");
        description = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextDouble();

        water[w] = new Water(Id, name, value, description, price);
        water = Arrays.copyOf(water, water.length + 1);

        System.out.println("Water successfully added to the warehouse");
        System.out.println("---" + water[w].getName() + "---");
        w++;

    }

    @Override
    public void addItem(Soda[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }


        System.out.println("Enter value");
        value = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter description");
        description = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter date of manufacture(dd.MM.yyyy)");
        dateIn = scanner.nextLine();
        System.out.println("Enter temperature");
        temperature = scanner.nextDouble();
        System.out.println("Enter experience days");
        expDay = scanner.nextInt();
        soda[s] = new Soda(Id, name, value, description, price,
                new ShelfLife(dateIn, temperature, expDay));
        soda = Arrays.copyOf(soda, soda.length + 1);

        System.out.println("Computer successfully added to the warehouse");
        System.out.println("\n---" + soda[s].getName() + "---");
        s++;

    }

    @Override
    public void addItem(Dress[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }
        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter value");
        value = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter description");
        description = scanner.nextLine();
        System.out.println("Enter price");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter year of foundation dd.MM.yyyy");
        year = scanner.nextLine();
        System.out.println("Enter brend name");
        brendName = scanner.nextLine();
        System.out.println("Enter value of personal");
        personal = scanner.nextInt();
        System.out.println("Enter num of country");
        countries = scanner.nextInt();


        dresses[d] = new Dress(Id, name, value, description, price,
                new Brend(year, brendName, personal, countries));
        dresses = Arrays.copyOf(dresses, dresses.length + 1);

        System.out.println("Computer successfully added to the warehouse");
        System.out.println("---" + dresses[d].getName() + "---");
        d++;

    }

    @Override
    public void sellItem(Smartphone[] mass) {
        scanner.nextLine();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("amount");
        int amount = scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }
            }
        }
        System.out.println(wallet);
    }

    @Override
    public void sellItem(Computer[] mass) {
        scanner.nextLine();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("amount");
        int amount = scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellItem(Vagetables[] mass) {
        scanner.nextLine();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("amount");
        int amount = scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellItem(Candy[] mass) {
        scanner.nextLine();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("amount");
        int amount = scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellItem(Water[] mass) {
        scanner.nextLine();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("amount");
        int amount = scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellItem(Soda[] mass) {
        scanner.nextLine();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("amount");
        int amount = scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellItem(Dress[] mass) {
        scanner.nextLine();
        System.out.println("name");
        String name = scanner.next();
        System.out.println("amount");
        int amount = scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    void repeet() {
        String yes = "y";
        String no = "n";
        Main.rerun = false;
        System.out.println("\nПродолжить?" +
                "\n(y)YES или (n)NO");
        String question = scanner.next();
        if (question.equals(yes)) {
            Main.rerun = true;
        } else if (question.equals(no)) {
            System.out.println("Спасибо");
        } else {
            System.out.println("Введите другую букву: ");
            repeet();
        }
    }


}
