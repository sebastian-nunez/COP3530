public class Prog27_01 {
    public static void main(String[] args) {
        new Prog27_01();
    }

    public Prog27_01() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(3, 4);

        System.out.println(g);
    }
}
