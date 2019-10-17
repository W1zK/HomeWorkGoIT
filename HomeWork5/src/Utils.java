import java.util.ArrayList;

class Utils {
    private double average = 0; //midl distance
    private Point[] point = new Point[7]; //point arr
    private Point pointArtil = new Point(6, 3); //artilery
    private Point[] sourcePoint = new Point[point.length];
    private Point[] allPoint = new Point[point.length * 2];
    private ArrayList<Integer> fPoint = new ArrayList<Integer>(); //bigerThenMidl
    private ArrayList<Integer> cPoint = new ArrayList<Integer>();
    private Vector[] vector = new Vector[point.length];
    private double[] derivative = new double[vector.length];
    private double[] distance = new double[allPoint.length];
    private boolean check = false;
    private Line[] lineMath = new Line[allPoint.length]; // AllLineCross
    private Line[] clothLineMath;
    private Line[] trapLine;
    private ArrayList<Point> crossLineVsLine = new ArrayList<Point>();
    private ArrayList<Point> sourceValideCross = new ArrayList<Point>();


    void run() {
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

    private void checker() {
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
            sourcePoints(point);
        }
    }

    private void delPoint1(double[] dot) {

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

    private void cVector(Point[] pnt) {

        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                vector[i] = new Vector(pnt[i].getX(), pnt[i + 1].getX(), pnt[i].getY(), pnt[i + 1].getY());
            } else vector[i] = new Vector(pnt[i].getX(), pnt[0].getX(), pnt[i].getY(), pnt[0].getY());
        }
        cDerivative(vector);
    }

    private void cDerivative(Vector[] vek) {
        for (int i = 0; i < derivative.length; i++) {
            if (i < vek.length - 1) {
                derivative[i] = (vek[i].getA() * vek[i + 1].getB()) - (vek[i].getB() * vek[i + 1].getA());
            } else derivative[i] = vek[i].getA() * vek[0].getB() - vek[i].getB() * vek[0].getA();
        }
        delPoint1(derivative);
    }

    ////////////////////////////////////////////////////////

    private void sourcePoints(Point[] source) {

        for (int i = 0; i < point.length; i++) {
            if (i < source.length - 1) {
                sourcePoint[i] = new Point((source[i].getX() + source[i + 1].getX()) / 2, (source[i].getY() + source[i + 1].getY()) / 2);
            } else
                sourcePoint[i] = new Point((source[i].getX() + source[0].getX()) / 2, (source[i].getY() + source[0].getY()) / 2);

        }
        simbios(point, sourcePoint);


    }

    private void simbios(Point[] mass1, Point[] mass2) {
        int j = 0;
        int g = 1;
        int f;
        for (int i = 0; i < allPoint.length; i++) {
            f = i % 2;
            if (i == 0) {
                allPoint[i] = mass1[i];

            } else if (f != 0) {
                allPoint[i] = mass2[j++];

            } else allPoint[i] = mass1[g++];
        }
        length(pointArtil, allPoint);
    }

    private void length(Point dot, Point[] spray) {
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Math.sqrt(Math.pow(dot.getX() - spray[i].getX(), 2) + Math.pow(dot.getY() - spray[i].getY(), 2));

        }
        midlDistance(distance);

    }

    private void midlDistance(double[] farFrom) {

        double sum = 0;

        if (farFrom.length > 0) {
            for (int i = 0; i < farFrom.length; i++) {
                sum += farFrom[i];
            }
            average = sum / farFrom.length;
        }
        farPoint(distance);
        crossLine(allPoint);

    }

    private void farPoint(double[] mass) {
        int k = 0;
        int n = 0;
        for (int i = 0; i < mass.length; i++) {
            if (average < mass[i]) {
                fPoint.add(i);
                k++;
            } else {
                cPoint.add(i);
                n++;
            }
        }
        trapLine = new Line[k];
        clothLineMath = new Line[n - 1];
        farLine(pointArtil,allPoint);
    }

    private void crossLine(Point[] allDot) {
        for (int i = 0; i < lineMath.length; i++) {
            if (i < lineMath.length - 1) {
                lineMath[i] = new Line(allDot[i].getX(), allDot[i + 1].getX(), allDot[i].getY(), allDot[i + 1].getY());
            } else
                lineMath[i] = new Line(allDot[i].getX(), allDot[0].getX(), allDot[i].getY(), allDot[0].getY());

        }
    }

    private void farLine(Point artillery, Point[] mass) {
        for (int i = 0; i < trapLine.length; i++) {
            trapLine[i] = new Line(artillery.getX(), mass[fPoint.get(i)].getX(), artillery.getY(), mass[fPoint.get(i)].getY());

        }
        neareLineCross(allPoint);


    }

    private void neareLineCross(Point[] mass) {
        for (int i = 0; i < clothLineMath.length; i++) {
            clothLineMath[i] = new Line(mass[cPoint.get(i)].getX(), mass[cPoint.get(i + 1)].getX(), mass[cPoint.get(i)].getY(), mass[cPoint.get(i + 1)].getY());
//

        }
        lineVsLine(clothLineMath, trapLine);

    }

    private void lineVsLine(Line[] cloth, Line[] far) {
        double x;
        double y1;
        double y2;
        for (int i = 0; i < far.length; i++) {//Пересечение главной линии с ближними линиями
            for (int j = 0; j < cloth.length; j++) {
                x = (far[i].getA() * cloth[j].getC() - cloth[j].getA() * far[i].getC()) / (cloth[j].getA() * far[i].getB() - far[i].getA() * cloth[j].getB());
                y1 = (far[i].getB() * x + far[i].getC()) / far[i].getA();
                y2 = (cloth[j].getB() * x + cloth[j].getC()) / cloth[j].getA();
                x = Math.round(x * 1000);
                y1 = Math.round(y1 * 1000);
                y2 = Math.round(y2 * 1000);
                crossLineVsLine.add(new Point(x / 1000, y2 / 1000));

            }

        }
        pointOnSegment(crossLineVsLine, allPoint);
    }

    private void pointOnSegment(ArrayList<Point> xy, Point[] mass) {
        double z;
        double v;
        for (int i = 0; i < cPoint.size() - 1; i++) {

            for (int j = 0; j < xy.size(); j++) {
                z = (Math.round((xy.get(j).getX() - mass[cPoint.get(i)].getX()) / (mass[cPoint.get(i + 1)].getX() - mass[cPoint.get(i)].getX()) * 1000)) / 1000;
                v = (Math.round((xy.get(j).getY() - mass[cPoint.get(i)].getY()) / (mass[cPoint.get(i + 1)].getY() - mass[cPoint.get(i)].getY()) * 1000)) / 1000;

                if (xy.get(j).getX() > mass[cPoint.get(i)].getX()
                        && xy.get(j).getX() < mass[cPoint.get(i + 1)].getX()
                        || xy.get(j).getX() > mass[cPoint.get(i + 1)].getX()
                        && xy.get(j).getX() < mass[cPoint.get(i)].getX()) {
                    if (xy.get(j).getY() > mass[cPoint.get(i)].getY()
                            && xy.get(j).getY() < mass[cPoint.get(i + 1)].getY()
                            || xy.get(j).getY() > mass[cPoint.get(i + 1)].getY()
                            && xy.get(j).getY() < mass[cPoint.get(i)].getY()) {
                        if (z == v) {
                            sourceValideCross.add(new Point(xy.get(j).getX(), xy.get(j).getY()));

                        }
                    }
                }

            }
        }
        creatValidePoint(sourceValideCross);


    }

    private void creatValidePoint(ArrayList<Point> valide) {
        for (int i = 0; i < valide.size(); i++) {
            for (int j = 1; j < valide.size(); j++) {

                if (valide.get(i).getX() == valide.get(j).getX() && valide.get(i).getY() == valide.get(j).getY()) {
                    valide.remove(i);


                }

            }


        }
        

    }
}
