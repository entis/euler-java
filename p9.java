package entis.euler;

public class p9 {
    /**
     A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

     a2 + b2 = c2
     For example, 32 + 42 = 9 + 16 = 25 = 52.

     There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     Find the product abc.
     */

    public static void main(String[] args) {

        for (int a = 1000; a > 0; a--) {
            for (int b = 1000; b > 0; b--) {
                if ((a*a) + (b*b) == (1000-a-b) * (1000-a-b)) {
                    System.out.println(a + ", " + b + ", " + (1000-a-b)); // triplet is 200, 375, 425
                    System.out.println(a * b * (1000-a-b)); // product is 31875000
                    break;
                }
            }
        }
    }
}
