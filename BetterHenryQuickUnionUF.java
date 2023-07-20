/* *****************************************************************************
 *  Name: Henry "TJ" Chen
 *  Last modified: July 20, 2023
 **************************************************************************** */

public class BetterHenryQuickUnionUF {
    // create starting array of N items with no connections
    private int[] id;
    private int[] size;  // size[i] = number of elements in subtree rooted at i

    public BetterHenryQuickUnionUF(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    // trace parent pointers until root reached
    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];  // flatten the tree by pointing to root
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
        if (i == j) return; // do nothing if they already share the same root
        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        }
        else {
            id[j] = i;
            size[i] += size[j];
        }
    }
}