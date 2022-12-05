public class OperatorChallenge {
    public static void main(String[] args) {
        // ori ricxvi maqvs da shemdeg vkreb da vamravleb 100-ze
        double num1 = 20.00d;
        double num2 = 80.00d;
        double num3 = (num1 + num2) * 100.00d;
        System.out.println("pasuxi" + " "  + num3);

        //migebul ricxvs vyof 40 ze nashtiani gamyofit
        double gayofa = num3 % 40.00d;
        System.out.println(gayofa);

//shevamowme damrcha tuara nashti. ar damrcha anu miigo true
        boolean noNashti = (gayofa == 0) ? true : false;
        System.out.println("nashtia" + " " + noNashti);

        //tu maqvs nashti damiwers amas tu arada ar damiwers
        if (!noNashti) {
            System.out.println("aris nashti");
        }
    }

}
