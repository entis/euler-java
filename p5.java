package entis.euler;

public class p5 {
    /** 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */

    public static void main(String[] args) {
        int counter = 2520;
        boolean result = false;

        while (!result) {
            for (int i=1; i <= 20; i++) {
                if (counter % i == 0) {
                    result = true;
                } else {
                    result = false;
                    counter++;
                    break;
                }
            }
        }

        System.out.println(counter); //232792560
    }
}
