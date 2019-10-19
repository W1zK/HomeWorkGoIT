public class Gngsa implements Circumcision {
    void gngsaMethod(String gpsType) {

        circumcision(gpsType);

        String messType = Main.subStr[0];
        char mode = Main.subStr[1].equals("") ? '-' : Main.subStr[1].charAt(0);
        int mode1 = Main.subStr[2].equals("") ? 0 : Integer.parseInt(Main.subStr[2]);
        int sat1 = Main.subStr[3].equals("") ? 0 : Integer.parseInt(Main.subStr[3]);
        int sat2 = Main.subStr[4].equals("") ? 0 : Integer.parseInt(Main.subStr[4]);
        int sat3 = Main.subStr[5].equals("") ? 0 : Integer.parseInt(Main.subStr[5]);
        int sat4 = Main.subStr[6].equals("") ? 0 : Integer.parseInt(Main.subStr[6]);
        int sat5 = Main.subStr[7].equals("") ? 0 : Integer.parseInt(Main.subStr[7]);
        int sat6 = Main.subStr[8].equals("") ? 0 : Integer.parseInt(Main.subStr[8]);
        int sat7 = Main.subStr[9].equals("") ? 0 : Integer.parseInt(Main.subStr[9]);
        int sat8 = Main.subStr[10].equals("") ? 0 : Integer.parseInt(Main.subStr[10]);
        int sat9 = Main.subStr[11].equals("") ? 0 : Integer.parseInt(Main.subStr[11]);
        int sat10 = Main.subStr[12].equals("") ? 0 : Integer.parseInt(Main.subStr[12]);
        int sat11 = Main.subStr[13].equals("") ? 0 : Integer.parseInt(Main.subStr[13]);
        int sat12 = Main.subStr[14].equals("") ? 0 : Integer.parseInt(Main.subStr[14]);
        double pdop = Main.subStr[15].equals("") ? 0 : Double.parseDouble(Main.subStr[15]);
        double hdop = Main.subStr[16].equals("") ? 0 : Double.parseDouble(Main.subStr[16]);
        double vdop = Main.subStr[17].equals("") ? 0 : Double.parseDouble(Main.subStr[17]);

        System.out.println("Type of message(String):" + messType +
                "\nMode 'M/A'(char):" + mode +
                "\nMode '1/2/3'(int):" + mode1 +
                "\nSatellite #1(int)" + sat1 +
                "\nSatellite #2(int)" + sat2 +
                "\nSatellite #3(int)" + sat3 +
                "\nSatellite #4(int)" + sat4 +
                "\nSatellite #5(int)" + sat5 +
                "\nSatellite #6(int)" + sat6 +
                "\nSatellite #7(int)" + sat7 +
                "\nSatellite #8(int)" + sat8 +
                "\nSatellite #9(int)" + sat9 +
                "\nSatellite #10(int)" + sat10 +
                "\nSatellite #11(int)" + sat11 +
                "\nSatellite #12(int)" + sat12 +
                "\nPDOP(double):" + pdop +
                "\nHDOP(double):" + hdop +
                "\nVDOP(double):" + vdop);


    }

}
