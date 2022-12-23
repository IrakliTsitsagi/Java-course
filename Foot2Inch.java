public class Foot2Inch {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCantimeters(2, 11));
calcFeetAndInchesToCantimeters(157);
    }

    public static double calcFeetAndInchesToCantimeters(double feet, double inches) {
        if (feet < 0) {
        } else if (inches < 0) {
            return -1;
        } else if (inches > 12) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCantimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to "
                + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCantimeters(feet, remainingInches);
    }

}


