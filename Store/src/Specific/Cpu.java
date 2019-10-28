package Specific;

public class Cpu implements TechSpecification {
    int core;
    double freq;

    public Cpu(int core, double freq) {
        this.core = core;
        this.freq = freq;
    }

    public int getCore() {
        return core;
    }

    public double getFreq() {
        return freq;
    }
}
