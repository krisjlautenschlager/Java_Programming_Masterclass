package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 17;
        short shortValue = 27;
        int intValue = 77;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
    }
}
