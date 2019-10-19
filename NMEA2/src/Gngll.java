public class Gngll implements Circumcision,TimeConvert{
    void gngllMethod(String gpsType) {
        Main main = new Main();

        circumcision(gpsType);

        String type = main.subStr[0];
        double latitude = main.subStr[1].equals("") ? 0 : Double.parseDouble(main.subStr[1]); //latitude
        char dir = main.subStr[2].equals("") ? '-' : main.subStr[2].charAt(0);
        double longitude = main.subStr[3].equals("") ? 0 : Double.parseDouble(main.subStr[3]); //longitude
        char dir1 = main.subStr[4].equals("") ? '-' : main.subStr[4].charAt(0);
        char dataType = main.subStr[6].equals("") ? '-' : main.subStr[6].charAt(0);

        System.out.println("Type of message(String):" + type +
                "\nLatitude(double,char):" + latitude + "," + dir +
                "\nLongitude(double,char):" + longitude + "," + dir1 +
                "\nTime registration hhmmss.sss(String(Date)):" + timeConvert(5) +
                "\nValid data(char):" + dataType);
    }
}
