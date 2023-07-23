/* *****************************************************************************
 *  Name: Henry "TJ" Chen
 *  Last modified: July 22, 2023
 *
 * Reads in a URL specified on the command line and saves its contents
 * in a file with the given name. DOES NOT output the data
 *
 * % java Wget https://introcs.cs.princeton.edu/data/codes.csv
 * % more codes.csv
 * United States,USA,00
 * Alabama,Al,01
 * Alaska,AK,02
 * ...
 **************************************************************************** */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

public class Wget {
    public static void main(String[] args) {

        // read in the data from given URL
        String url = args[0];
        In in = new In(url);
        String data = in.readAll();

        // write the data to a file
        String filename = url.substring(url.lastIndexOf('/') + 1);
        Out out = new Out(filename);
        out.println(data);
        out.close();
    }
}
