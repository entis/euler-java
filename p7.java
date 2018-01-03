package entis.euler;

public class p7 {
    /** By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

     What is the 10 001st prime number? */

    public static void main(String[] args) {
        int primesCounter = 1;
        int counter = 0;

        while (primesCounter < 10001) {

            for (int i=2;i<counter;i++) {
                if (counter % i == 0) {
                    break;
                }

                if (i+1 == counter) {
                    primesCounter++;
                }
            }

            counter++;
        }

        System.out.println(--counter); //104743
    }
}
