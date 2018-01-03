package entis.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p4 {
    /** A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

     Find the largest palindrome made from the product of two 3-digit numbers.*/

    public static void main(String[] args) {
        String no;
        String temp;
        int a = 999;
        int b = 999;
        List<String> numbers = new ArrayList<>();

        while (a > 99) {

            while (b > 99) {
                no = (a * b) + "";
                temp = no.substring(5) + no.substring(4, 5) + no.substring(3, 4);

                if (no.substring(0,3).equals(temp)) {
                    numbers.add(no);
                }

                b--;
            }

            b = 999;

            a--;
        }

        Collections.sort(numbers);

        System.out.println(numbers.get(numbers.size() - 1)); // 906609
    }
}
