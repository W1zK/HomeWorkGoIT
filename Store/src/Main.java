import java.text.ParseException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static boolean rerun = true;
    private static Store store = new Store();
    private static SubscriptionManager subscriptionManager = new SubscriptionManager();


    static void doing() throws ParseException {
        while (rerun) {
            rerun = false;
            System.out.println("Выберите категорию");
            System.out.println("\n1-smartphones"+"\n2-computers"+"\n3-vagetables"+
                                "\n4-candies"+"\n5-water"+"\n6-soda"+"\n7-dresses"+
                                "\n8-Wallet info"+"\n9-User add & message"+"\n0-EXIT");
            int d = scanner.nextInt();
            switch (d) {
                case 1:
                    store.doType(store.smartphones);

                    break;
                case 2:
                    store.doType(store.computers);

                    break;
                case 3:
                    store.doType(store.vagetables);

                    break;
                case 4:
                    store.doType(store.candies);

                    break;
                case 5:
                    store.doType(store.water);

                    break;
                case 6:
                    store.doType(store.soda);
                    break;
                case 7:
                    store.doType(store.dresses);
                    break;
                case 8:
                    System.out.println("Wallet: " + store.wallet + "$");
                    store.repeet();
                    break;
                case 9: subscriptionManager.doi();
                default:


            }
        }

    }

    public static void main(String[] args) throws ParseException {
        doing();





    }

}
