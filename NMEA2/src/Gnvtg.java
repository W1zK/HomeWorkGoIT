public class Gnvtg implements Circumcision {
    void gnvtgMethod(String gpsType) {

        circumcision(gpsType);

        String messType = Main.subStr[0];
        double course1 = Main.subStr[1].equals("") ? 0 : Double.parseDouble(Main.subStr[1]);
        char t = Main.subStr[2].equals("") ? '-' : Main.subStr[2].charAt(0);
        double course2 = Main.subStr[3].equals("") ? 0 : Double.parseDouble(Main.subStr[3]);
        char m = Main.subStr[4].equals("") ? '-' : Main.subStr[4].charAt(0);
        double speed1 = Main.subStr[5].equals("") ? 0 : Double.parseDouble(Main.subStr[5]);
        char n = Main.subStr[6].equals("") ? '-' : Main.subStr[6].charAt(0);
        double speed2 = Main.subStr[7].equals("") ? 0 : Double.parseDouble(Main.subStr[7]);
        char k = Main.subStr[8].equals("") ? '-' : Main.subStr[8].charAt(0);
        char mode = Main.subStr[9].equals("") ? '-' : Main.subStr[9].charAt(0);

        System.out.println("Message type(String):" + messType +
                "\nCourse over ground, degrees True(double,char):" + course1 + t +
                "\nCourse over ground, degrees Magnetic(double,char):" + course2 + m +
                "\nSpeed over ground in knots(double,char):" + speed1 + n +
                "\nSpeed over ground in kilometers per hour(double,char):" + speed2 + k +
                "\nMode(char):" + mode);
    }

}
