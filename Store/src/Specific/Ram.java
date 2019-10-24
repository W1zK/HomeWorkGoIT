package Specific;

public class Ram implements TechSpecification {
    int value;
    String type;
    public Ram(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
