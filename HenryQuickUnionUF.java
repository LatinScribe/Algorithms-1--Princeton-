/* *****************************************************************************
 *  Name: Henry "TJ" Chen
 *  Last modified: July 18, 2023
 *
 * Using the Quick-union method to solve the Dynamic Connectivity problem
 **************************************************************************** */

public class HenryQuickUnionUF {
    // create starting array of N items with no connections
    private int[] id;

    public HenryQuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    // trace parent pointers until root reached
    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    // connected if they have the same root
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    // make the root of p a child of the root of q
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
