class Gpgsv implements Circumcision {

    void gpgsvMethod(String gpsType) {

        circumcision(gpsType);

        String type = Main.subStr[0];
        int qMassage = Main.subStr[1].equals("") ? 0 : Integer.parseInt(Main.subStr[1]); //quantity massage
        int numMassage = Main.subStr[2].equals("") ? 0 : Integer.parseInt(Main.subStr[2]); // number massage
        int qSat = Main.subStr[3].equals("") ? 0 : Integer.parseInt(Main.subStr[3]); //quantity satellite
        int satId = Main.subStr[4].equals("") ? 0 : Integer.parseInt(Main.subStr[4]); //number satellite
        int elevation = Main.subStr[5].equals("") ? 0 : Integer.parseInt(Main.subStr[5]); //elevation angle
        int azimuth = Main.subStr[6].equals("") ? 0 : Integer.parseInt(Main.subStr[6]); //azimuth
        int snr = Main.subStr[7].equals("") ? 0 : Integer.parseInt(Main.subStr[7]); //signal strength
        int satId1 = Main.subStr[8].equals("") ? 0 : Integer.parseInt(Main.subStr[8]); //number satellite
        int elevation1 = Main.subStr[9].equals("") ? 0 : Integer.parseInt(Main.subStr[9]); //elevation angle
        int azimuth1 = Main.subStr[10].equals("") ? 0 : Integer.parseInt(Main.subStr[10]); //azimuth
        int snr1 = Main.subStr[11].equals("") ? 0 : Integer.parseInt(Main.subStr[11]); //signal strength
        int satId2 = Main.subStr[12].equals("") ? 0 : Integer.parseInt(Main.subStr[12]);
        int elevation2 = Main.subStr[13].equals("") ? 0 : Integer.parseInt(Main.subStr[13]);
        int azimuth2 = Main.subStr[14].equals("") ? 0 : Integer.parseInt(Main.subStr[14]);
        int snr2 = Main.subStr[15].equals("") ? 0 : Integer.parseInt(Main.subStr[15]);
        int satId3 = Main.subStr[16].equals("") ? 0 : Integer.parseInt(Main.subStr[16]);
        int elevation3 = Main.subStr[17].equals("") ? 0 : Integer.parseInt(Main.subStr[17]);
        int azimuth3 = Main.subStr[18].equals("") ? 0 : Integer.parseInt(Main.subStr[18]);
        int snr3 = Main.subStr[19].equals("") ? 0 : Integer.parseInt(Main.subStr[19]);

        System.out.println("Type of massage(String):" + type +
                "\nQuantity massage(int):" + qMassage +
                "\nNumber of massage(int):" + numMassage +
                "\nQuantity satellite(int):" + qSat +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId +
                "\nElevation angle(int):" + elevation +
                "\nAzimuth(int):" + azimuth +
                "\nSignal strength(int):" + snr +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId1 +
                "\nElevation angle(int):" + elevation1 +
                "\nAzimuth(Integer):" + azimuth1 +
                "\nSignal strength(int):" + snr1 +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId2 +
                "\nElevation angle(int):" + elevation2 +
                "\nAzimuth(int):" + azimuth2 +
                "\nSignal strength(int):" + snr2 +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId3 +
                "\nElevation angle(int):" + elevation3 +
                "\nAzimuth(int):" + azimuth3 +
                "\nSignal strength(int):" + snr3);


    }
}
