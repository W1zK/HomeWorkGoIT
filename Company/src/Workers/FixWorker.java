package Workers;

public class FixWorker extends Worker {
    private float payment;

    public FixWorker(String firstName, String secondName, float payment) {
        super(firstName, secondName);
        this.payment = payment;
    }

    @Override
    public float payCalc() {
        return payment;
    }


    @Override
    public String toString() {
        return "Workers.FixWorker{" +
                "payment=" + payment +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
