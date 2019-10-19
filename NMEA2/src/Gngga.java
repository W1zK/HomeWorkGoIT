public class Gngga implements Circumcision,TimeConvert{
    void gnggaMethod(String gpsType) {

        circumcision(gpsType);

        String messType = Main.subStr[0];
        double lat = Main.subStr[2].equals("") ? 0 : Double.parseDouble(Main.subStr[2]); //latitude
        char dirLat = Main.subStr[3].equals("") ? '-' : Main.subStr[3].charAt(0);
        double lon = Main.subStr[4].equals("") ? 0 : Double.parseDouble(Main.subStr[4]); //longitude
        char dirLon = Main.subStr[5].equals("") ? '-' : Main.subStr[5].charAt(0);
        int gpsIndic = Main.subStr[6].equals("") ? 0 : Integer.parseInt(Main.subStr[6]);
        int satUsed = Main.subStr[7].equals("") ? 0 : Integer.parseInt(Main.subStr[7]);
        double hdop = Main.subStr[8].equals("") ? 0 : Double.parseDouble(Main.subStr[8]);
        double altitude = Main.subStr[9].equals("") ? 0 : Double.parseDouble(Main.subStr[9]);
        char m1 = Main.subStr[10].equals("") ? '-' : Main.subStr[10].charAt(0);
        double geoSepar = Main.subStr[11].equals("") ? 0 : Double.parseDouble(Main.subStr[11]);
        char m2 = Main.subStr[12].equals("") ? '-' : Main.subStr[12].charAt(0);
        String nothing = Main.subStr[13];
        int dgpsId = Main.subStr[14].equals("") ? 0 : Integer.parseInt(Main.subStr[14]);

        System.out.println("Message type(String):" + messType +
                "\nTime(String(Date)):" + timeConvert(1) +
                "\nLatitude(double,char):" + lat + "," + dirLat +
                "\nLongitude(double,char):" + lon + "," + dirLon +
                "\nGPS indicate(int):" + gpsIndic +
                "\nSatellite used(int):" + satUsed +
                "\nHorizontal dilution of precision(double):" + hdop +
                "\nAltitude(double,char):" + altitude + m1 +
                "\nGeoidal Separation(double,char):" + geoSepar + m2 +
                "\nDGPS Station ID(int):" + dgpsId);
    }
}
