public class Main {

    static private Point[] point = new Point[7];
    static private Vector[] vector = new Vector[point.length];
    static private double[] derivative = new double[vector.length];
    static private boolean check = false;

    static private void checker() {
        for (int i = 0; i < derivative.length; i++) {
            if (derivative[i] > 0) {
                check = true;
            }
        }
        if (check) {
            System.out.println("!!!Фигура Опуклая!!!");
            for (int i = 0; i < derivative.length; i++) {
                System.out.println(derivative[i]);

            }
        }
    }

    static private void delPoint1(double[] dot) {

        for (int i = 0; i < dot.length; i++) {
            int k = 0;
            while (dot[i] < 0) {
                if (i == dot.length - 1) {
                    point[k + 1] = point[k];
                    cVector(point);
                } else if (i != dot.length - 1) {
                    point[i + 1] = point[i];
                    cVector(point);
                }
            }
        }
    }


    static private void cVector(Point[] pnt) {

        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                vector[i] = new Vector(pnt[i].getX(), pnt[i + 1].getX(), pnt[i].getY(), pnt[i + 1].getY());
            } else vector[i] = new Vector(pnt[i].getX(), pnt[0].getX(), pnt[i].getY(), pnt[0].getY());
        }
        cDerivative(vector);
    }


    static private void cDerivative(Vector[] vek) {
        for (int i = 0; i < derivative.length; i++) {
            if (i < vek.length - 1) {
                derivative[i] = (vek[i].getA() * vek[i + 1].getB()) - (vek[i].getB() * vek[i + 1].getA());
            } else derivative[i] = vek[i].getA() * vek[0].getB() - vek[i].getB() * vek[0].getA();
        }
        delPoint1(derivative);
    }

    public static void main(String[] args) {

        point[0] = new Point(-1.5, 1.5);
        point[1] = new Point(-4, 2);
        point[2] = new Point(-2.5, -1.5);
        point[3] = new Point(0.5, -2.5);
        point[4] = new Point(1.5, -0.5);
        point[5] = new Point(1, 1);
        point[6] = new Point(-0.5, 4);

        cVector(point);
        checker();
    }



}
