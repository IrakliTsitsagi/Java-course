public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(122, 5));
        getDurationString(7000);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "invalid value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

// 0 ebi mivumate  magalitad 01 saati 01 wuti 01 wami

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minuteString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minuteString + " " + secondsString + "";


    }

    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("invalid value");
            return -1;
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            int hours = seconds / 3600;
            int remainingMinutes = minutes % 60;
            System.out.println(seconds + " seconds are " + hours +
                    "h " + remainingMinutes + "m " + remainingSeconds + "s");

            return minutes;
        }
    }
}
