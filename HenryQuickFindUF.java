/* *****************************************************************************
 *  Name: Henry "TJ" Chen
 *  Last modified: July 18, 2023
 *
 * Solves the Dynamic Connectivity problem using the Quick-find method
 **************************************************************************** */

public class HenryQuickFindUF {

    // create the initial array of N objects with no connections
    private int[] id;

    public HenryQuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    // check if two objects in the array are connected
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    // create a connection between the two objects in the array
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) {
                id[i] = qid;
            }
    }
}
