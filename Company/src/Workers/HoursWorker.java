package Workers;

public class HoursWorker extends Worker {
    private float payment;

    @Override
    public float payCalc() {
        return payment;
    }

    public HoursWorker(String firstName, String secondName, float payment) {
        super(firstName, secondName);
        this.payment = payment;
    }

    public HoursWorker(String firstName, String secondName, float day, float hours, float price) {
        super(firstName, secondName);
        this.payment = day*hours*price;

    }


    @Override
    public String toString() {
        return "Workers.HoursWorker{" +
                "payment=" + payment +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

}
