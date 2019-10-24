package Specific;



public class Warranty implements TechSpecification {
    private int warranty;

    public Warranty(int warranty) {
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
