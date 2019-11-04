public class Main {

    static {
        Utilities load = new Utilities();
        load.loadCompany();
    }

    public static void main(String[] args) {
        Utilities utilities = new Utilities();
        utilities.run();

    }
}
