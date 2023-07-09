/* *****************************************************************************
 *  Name:              Henry "TJ" Chen
 *  Adapted from Algorithms and Datastructures 1 (Princeton)
 *  Last modified:     July 9, 2023
 *
 * takes two names as command-line arguments and prints out a message
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] + " and " + args[1]);
        System.out.println("Goodbye " + args[1] + " and " + args[0]);
    }
}
