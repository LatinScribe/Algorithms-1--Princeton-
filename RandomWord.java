/* *****************************************************************************
 *  Name:              Henry "TJ" Chen
 *  Adapted from Algorithms and Datastructures 1 (Princeton)
 *  Last modified:     July 9, 2023
 *
 * Reads a sequence of words from standard input and prints out one of these
 * words uniformly at random using Knuth's method
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";

        for (int i = 1; !StdIn.isEmpty(); i++) {
            String contender = StdIn.readString();
            if (StdRandom.bernoulli(1.0/i)) {
               champion = contender;
            }
        }
        System.out.println(champion);
    }
}
