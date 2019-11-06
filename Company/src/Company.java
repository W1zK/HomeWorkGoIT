import Workers.FixWorker;
import Workers.Freelance;
import Workers.HoursWorker;

public class Company {
    public static Company company;

    FixWorker[] fixedWorker;
    HoursWorker[] nonFixWorker;
    Freelance[] freelanceWorker;


    static Company getInstance() {
        if (company == null) {
            company = new Company();
        }
        return company;
    }


    FixWorker[] getFixedWorker() {
        return fixedWorker;
    }

    HoursWorker[] getNonFixWorker() {
        return nonFixWorker;
    }

    Freelance[] getFreelanceWorker() {
        return freelanceWorker;
    }

    void setFixedWorker(FixWorker[] fixedWorker) {

        if (fixedWorker != null) {
            this.fixedWorker = fixedWorker;
        } else this.fixedWorker = new FixWorker[0];
    }

    void setNonFixWorker(HoursWorker[] nonFixWorker) {
        if (nonFixWorker != null) {
            this.nonFixWorker = nonFixWorker;
        } else this.nonFixWorker = new HoursWorker[0];
    }

    void setFreelanceWorker(Freelance[] freelanceWorker) {
        if (freelanceWorker != null) {
            this.freelanceWorker = freelanceWorker;
        } else this.freelanceWorker = new Freelance[0];
    }
}

