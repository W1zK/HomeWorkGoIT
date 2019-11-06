import Workers.Worker;

public interface InfoServices {

    default String infoWorkers(Worker[] workers) {
        String str = "";
        for (Worker x : workers) {
            str += x.toString() + "\n";
        }
        return str;
    }

    default float paymentCalc(Worker[] workers) {
        float exp = 0;
        for (Worker x : workers) {
            exp += x.payCalc();
        }
        return exp;
    }
}
