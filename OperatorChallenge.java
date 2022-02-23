package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double thirdDouble = (firstDouble + secondDouble) * 100.00d;
        System.out.println("My total is : " + thirdDouble);
        double fourthDouble = thirdDouble % 40.00d;
        System.out.println("The remainder is : " + fourthDouble);

        boolean fifthDouble = false;
        if (fourthDouble == 0) {
            fifthDouble = true;
        }

        System.out.println("The boolean value is: " + fifthDouble);

        if (!fifthDouble) {
            System.out.println("Got some remainder");
        }
    }
}
