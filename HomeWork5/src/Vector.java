class Vector {
    private double a;
    private double b;

    public Vector(double x, double x1,double y,double y1) {

        this.a=x1-x;
        this.b=y1-y;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
