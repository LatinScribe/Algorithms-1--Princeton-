/* *****************************************************************************
 *  Name: Henry "TJ" Chen
 *
 * Last Modified: July 23, 2023
 **************************************************************************** */

import edu.princeton.cs.algs4.StdDraw;

public class DrawRightTriangle {
    public static void main(String[] args) {
        StdDraw.square(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.line(0.5, 0.5, 0.9, 0.5);
        StdDraw.line(0.9, 0.5, 0.5, 0.8);
        StdDraw.line(0.5, 0.8, 0.5, 0.5);
        StdDraw.circle(0.7, 0.65, 0.25);
    }
}
