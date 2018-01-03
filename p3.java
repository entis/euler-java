package entis.euler;

public class p3 {
    /** The prime factors of 13195 are 5, 7, 13 and 29.

     What is the largest prime factor of the number 600851475143 ? */

    public static void main(String[] args) {
        long prime = 1;
        long no = 600851475143L;
        long counter = 1;
        long[] primes;

        while (counter <= no) {

            if (no % counter == 0) {
                prime = counter;
                no = no / counter;
            }

            counter++;
        }

        System.out.println(prime); // 6857
    }
}