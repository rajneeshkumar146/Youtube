import java.util.ArrayList;

public class graph {
    private static class Edge {
        int v, w;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    private static void addEdge(ArrayList<Edge>[] gp, int u, int v, int w) {
        gp[u].add(new Edge(v, w));
        gp[v].add(new Edge(u, w));
    }

    public static void main(String[] args) {
        int N = 8;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] gp = new ArrayList[N];
        for(int i = 0;i < N;i++)
          gp[i] = new ArrayList<>();

        addEdge(gp,1,2,10);
        addEdge(gp,1,4,10);
        addEdge(gp,2,3,10);
        addEdge(gp,3,4,40);
        addEdge(gp,4,5,2);;
        addEdge(gp,5,6,2);
        addEdge(gp,5,7,3);
        addEdge(gp,6,7,8);
    }
}