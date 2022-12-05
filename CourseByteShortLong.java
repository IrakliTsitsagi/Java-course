public class CourseByteShortLong {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        // 50000 sa daumate  10 jer shorti longi da intio
        long longTotal = 50000L + 10L* (byteValue + shortValue + intValue);
        System.out.println(longTotal);
    }
}
