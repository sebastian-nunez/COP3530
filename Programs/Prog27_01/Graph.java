import java.util.Arrays;

public class Graph implements GraphInterface {
    private int numVertices;
    private int[][] matrix;

    public Graph() {
        numVertices = 5;
        matrix = new int[numVertices][numVertices];
    }

    public Graph(int v) {
        numVertices = v;
        matrix = new int[numVertices][numVertices];
    }

    @Override
    public void addEdge(int v, int w) {
        matrix[v][w] = 1;
        matrix[w][v] = 1;

    }

    @Override
    public void removeEdge(int v, int w) {
        matrix[v][w] = 0;
        matrix[w][v] = 0;
    }

    @Override
    public int[] findAdjacencyVertices(int v) {
        int[] vert = new int[numVertices];
        int totalAdjacentVertices = 0;

        for (int i = 0; i < numVertices; i++) {
            if (matrix[v][i] == 1) {
                vert[totalAdjacentVertices] = i;
                totalAdjacentVertices++;
            }
        }
        return Arrays.copyOf(vert, totalAdjacentVertices); // resize the array to only include the vertices found
    }

    public void BFT(int v) {
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            visited[i] = false;
        }

        Queue vertexQueue = new Queue();
        vertexQueue.enqueue(v);
        visited[v] = true; // mark as visited

        while (!vertexQueue.isEmpty()) {
            int w = vertexQueue.getFront();
            System.out.println(w);
            vertexQueue.dequeue();

            int[] adj = findAdjacencyVertices(w);
            for (int u : adj) {
                if (!visited[u]) {
                    vertexQueue.enqueue(u);
                    visited[u] = true;
                }
            }
        }
    }

    public String toString() {
        String out = "";

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                out += matrix[i][j] + " ";
            }

            out += "\n";
        }

        return out;
    }

}
