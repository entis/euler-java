package entis.euler;

public class p10 {
    /**
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     *
     * Find the sum of all the primes below two million.
     */

    public static void main(String[] args) {
        long sum = 0;

        for (int i = 2; i < 2000000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += i;
                System.out.println(i); // check it's working, it takes loooong time to calculate
            }
        }

        System.out.println(sum); // 142913828922
    }
}
