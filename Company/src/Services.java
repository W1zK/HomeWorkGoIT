import Workers.Worker;

public class Services {
    public static String infoWorkers(Worker[] employee) {
        String str = "";
        try {
            for (Worker x : employee) {
                str += x.toString() + "\n";
            }
            return str;
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
        return null;
    }
    public static float paymentCalc(Worker[] employee) {
        float expenses = 0;
        try {
            for (Worker x : employee) {
                expenses += x.payCalc();
            }
            return expenses;
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
        return 0;
    }
}
