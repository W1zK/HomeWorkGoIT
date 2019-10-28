package Specific;

public class WorkTimeBaterry implements TechSpecification {
    int time;

    public WorkTimeBaterry(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
