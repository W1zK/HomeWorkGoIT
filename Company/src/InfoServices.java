import Workers.Worker;

public class InfoServices {
    public static String infoWorkers(Worker[] workers) {
        String str = "";
        try {
            for (Worker x : workers) {
                str += x.toString() + "\n";
            }
            return str;
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
        return null;
    }
    public static float paymentCalc(Worker[] workers) {
        float exp = 0;
        try {
            for (Worker x : workers) {
                exp += x.payCalc();
            }
            return exp;
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
        return 0;
    }
}
