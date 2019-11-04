package Workers;

public class Freelance extends Worker {
    private float payment;
    private float hours;
    private float price;


    public Freelance(String firstName, String secondName, float payment, float hours, float price) {
        super(firstName, secondName);
        this.payment = payment;
        this.hours = hours;
        this.price = price;
    }

    public Freelance(String firstName, String secondName, float hours, float price) {
        super(firstName, secondName);
        this.price = price;
        this.hours = hours;
        this.payment = price*hours;
    }

    public float getHours() {
        return hours;
    }

    public float getPrice() {
        return price;
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
