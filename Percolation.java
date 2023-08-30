/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    // this will keep track of which parts of the grid are connected
    private WeightedQuickUnionUF conn_grid;
    // this keeps track of closed(0) or open(1),
    private int[] status_grid;
    private int grid_size;
    private int num_open;

    // Adds "imaginary" nodes at the first and last spot to
    // which correspond to top and bottom, which are connected to the topmost
    // nodes and bottommost nodes respectively
    // Then creates n-by-n grid, with all sites initially blocked
    // (except for imaginary spots which always start open)
    public Percolation(int n) {

        conn_grid = new WeightedQuickUnionUF(n * n + 2);
        for (int i = 0; i < n; i++) {
            conn_grid.union(0, i + 1);
            conn_grid.union(n * n + 2, n * n + 2 - 1 - i);
        }
        status_grid = new int[n * n + 2];
        for (int i = 1; i < n * n + 1; i++) {
            status_grid[i] = 0;
        }
        status_grid[0] = 1;
        status_grid[n * n + 2] = 1;

        grid_size = n;
        num_open = 0;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        // By convention, the row and column indices are integers between 1 and n,
        // where (1, 1) is the upper-left site
        // So subtract 1 from each to compensate
        int adj_row = row - 1;
        int adj_col = col - 1;
        status_grid[adj_row * grid_size + adj_col + 1] = 1;
        num_open += 1;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        // adjust the coordinates
        int adj_row = row - 1;
        int adj_col = col - 1;
        return status_grid[adj_row * grid_size + adj_col + 1] == 1;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        int id_val = (row-1) * grid_size + (col-1) + 1;
        if (0 <= (id_val - 1) && (id_val - 1) <= (grid_size * grid_size + 2) )
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return num_open;
    }

    // does the system percolate?
    public boolean percolates() {
        return conn_grid.find(grid_size * grid_size + 2) == conn_grid.find(0);
    }

    // test client (optional)
    public static void main(String[] args) {
    }
}
