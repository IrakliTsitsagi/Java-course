public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("10000 at " + i + "% interest = "
                    + calculateInterest(10000, i));
        }
    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }
}
