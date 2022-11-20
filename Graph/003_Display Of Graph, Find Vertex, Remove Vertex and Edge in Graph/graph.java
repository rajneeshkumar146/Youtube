import java.util.ArrayList;

public class graph {
    private static class Edge {
        int v, w;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString() {
            return "(" + this.v + ", " + this.w + ")";
        }
    }

    // O(V + E)
    public static void display(ArrayList<Edge>[] gp, int N) {
        for (int u = 0; u < N; u++) {
            System.out.print(u + " -> ");
            for (Edge e : gp[u]) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    // O(1)
    private static void addEdge(ArrayList<Edge>[] gp, int u, int v, int w) {
        gp[u].add(new Edge(v, w));
        gp[v].add(new Edge(u, w));
    }

    // O(E)
    public static boolean findEdge(ArrayList<Edge>[] gp, int u, int v) {
        ArrayList<Edge> list = gp[u];
        for (Edge e : list) {
            if (e.v == v)
                return true;
        }

        return false;
    }

    // O(2E) == O(E)
    private static void removeDirectionalEdge(ArrayList<Edge>[] gp, int u, int v) {
        ArrayList<Edge> list = gp[u];

        for (int i = list.size() - 1; i >= 0; i--)
            if (list.get(i).v == v)
                list.remove(i);
    }

    public static void removeEdge(ArrayList<Edge>[] gp, int u, int v) {
        removeDirectionalEdge(gp, u, v);
        removeDirectionalEdge(gp, v, u);
    }

    // O(E)
    public static void removeVertex(ArrayList<Edge>[] gp, int u) {
        ArrayList<Edge> list = gp[u];

        for (int i = list.size() - 1; i >= 0; i--) {
            removeEdge(gp, u, list.get(i).v);
        }
    }

    public static void main(String[] args) {
        int N = 8;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] gp = new ArrayList[N];
        for (int i = 0; i < N; i++)
            gp[i] = new ArrayList<>();

        addEdge(gp, 1, 2, 10);
        addEdge(gp, 1, 4, 10);
        addEdge(gp, 2, 3, 10);
        addEdge(gp, 3, 4, 40);
        addEdge(gp, 4, 5, 2);
        addEdge(gp, 5, 6, 2);
        addEdge(gp, 5, 7, 3);
        addEdge(gp, 6, 7, 8);

        display(gp, N);
    }
}