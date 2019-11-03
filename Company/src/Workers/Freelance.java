package Workers;

public class Freelance extends Worker {
    private float payment;

    public Freelance(String firstName, String secondName, float payment) {
        super(firstName, secondName);
        this.payment = payment;
    }
    public Freelance(String firstName, String secondName, float hours, float price) {
        super(firstName, secondName);
        this.payment = price*hours;
    }

    @Override
    public float payCalc() {
        return payment;
    }

    @Override
    public String toString() {
        return "Workers.Freelance{" +
                "payment=" + payment +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
