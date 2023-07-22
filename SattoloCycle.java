/* *****************************************************************************
 *  Name: Henry "TJ" Chen
 *  Last modified: July 21, 2023
 *
 * Generate a uniformly distributed cycle of length N using Sattolo's algorithm
 * See this for a great explanation of the Sattolo algorithm:
 * https://danluu.com/sattolo/#fn:P
 *
 * NOTE: This does NOT generate a random derangement with uniform probability
 * It instead guarantees a derangement with exactly one cycle
 *
 *  %  echo 0 1 2 3 4 | java SattoloCycle
 *  1
 *  2
 *  4
 *  0
 *  3
 **************************************************************************** */
import edu.princeton.cs.algs4.StdIn;

import java.util.concurrent.ThreadLocalRandom;

public class SattoloCycle {
    private SattoloCycle() { }

    public static void cycle(String[] input) {
        int n = input.length;
        for (int i = 0; i < n - 1; i++) {
            int j = ThreadLocalRandom.current().nextInt(i + 1, n);
            String temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter the items you would like to shuffle");
        System.out.println("Enter Ctrl-d to enter your items");
        // read in the data
        String[] user_input = StdIn.readAllStrings();

        // shuffle the given array
        SattoloCycle.cycle(user_input);

        // output the results
        for (int i = 0; i < user_input.length; i++) {
            System.out.println(user_input[i]);
        }
    }
}
