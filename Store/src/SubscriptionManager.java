
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class SubscriptionManager {


    private Users[] users = new Users[1];
    private Sender sender = new Sender("shcherbanuk.a@blest.ua", "zxc123A21");
    private String sendFrom = "shcherbanuk.a@blest.ua";
    private Scanner scanner = new Scanner(System.in);
    private Store store = new Store();
    private int k = 0;

    public void doi() throws ParseException {
        System.out.println("1 - Add User" +
                "\n2 - Send Message");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                userAdd();
                store.repeet();
                break;
            case 2:
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Enter message");
                String message = scanner.next();
                sendMessage(name, message);
                store.repeet();
                break;
            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                store.repeet();


        }


    }


    private void sendMessage(String subject, String message) {
        for (int i = 0; i < users.length-1; i++) {
            if (users[i].ifSend) {
                sender.send(subject, message, sendFrom, users[i].getEmail());
            }
        }
    }

    private void userAdd() throws ParseException {


        System.out.println("Enter ID");
        int Id =scanner.nextInt();
        if (users.length == 1) {
            scanner.nextLine();
            System.out.println("Enter user name: ");
            String name =scanner.nextLine();
            System.out.println("Enter user email: ");
            String email = scanner.nextLine();
            System.out.println("Enter today date dd/MM/yyyy: ");
            String signUpDate =scanner.nextLine();
            System.out.println("Send emails to user? (1-Y/2-N)");
            boolean sendMail = false;
            int choice = scanner.nextInt();
            if (choice == 1) {
                sendMail = true;
            }
            users[k] = new Users(Id, name, email, signUpDate, sendMail);
            users = Arrays.copyOf(users, users.length + 1);
            System.out.println("New user" + users[k].getUserName());
            k++;

        } else {
            for (int i = 0; i < users.length-1; i++) {
                if (Id == users[i].getUserId()) {
                    System.out.println("User already registered");
                    Main.rerun =true;
                    Main.doing();
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Enter user name: ");
            String name = scanner.nextLine();
            System.out.println("Enter user email: ");
            String email = scanner.nextLine();
            System.out.println("Enter today date dd/MM/yyyy: ");
            String signUpDate = scanner.nextLine();
            System.out.println("Send emails to user? (1-Y/2-N)");
            boolean sendMail = false;
            int choice = scanner.nextInt();
            if (choice == 1) {
                sendMail = true;
            }
            users[k] = new Users(Id, name, email, signUpDate, sendMail);
            users = Arrays.copyOf(users, users.length + 1);
            System.out.println("New user"+ users[k].getUserName());
            k++;


        }


    }
}




