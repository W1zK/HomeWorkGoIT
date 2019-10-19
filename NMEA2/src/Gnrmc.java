public class Gnrmc implements Circumcision,TimeConvert,DateConvert{
    void gnrmcMethod(String gpsType) {


        circumcision(gpsType);

        String type = Main.subStr[0];
        char status = Main.subStr[2].equals("") ? '-' : Main.subStr[2].charAt(0);
        double lat = Main.subStr[3].equals("") ? 0 : Double.parseDouble(Main.subStr[3]);
        char dirLat = Main.subStr[4].equals("") ? '-' : Main.subStr[4].charAt(0);
        double lon = Main.subStr[5].equals("") ? 0 : Double.parseDouble(Main.subStr[5]);
        char dirLon = Main.subStr[6].equals("") ? '-' : Main.subStr[6].charAt(0);
        double speed = Main.subStr[7].equals("") ? 0 : Double.parseDouble(Main.subStr[7]);
        double course = Main.subStr[8].equals("") ? 0 : Double.parseDouble(Main.subStr[8]);
        char mode = Main.subStr[10].equals("") ? '-' : Main.subStr[10].charAt(0);


        System.out.println("Message type(String):" + type +
                "\nTime(String(Date)):" + timeConvert(1) +
                "\nStatus(char):" + status +
                "\nLatitude(double,char):" + lat + "," + dirLat +
                "\nLongitude(double,char):" + lon + "," + dirLon +
                "\nSpeed(double):" + speed +
                "\nCourse(double):" + course +
                "\nDate(Date):" + dateConvert(9) +
                "\nMode(char):" + mode);
    }

}
