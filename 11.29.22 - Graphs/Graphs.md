# Graphs

> **Definition:** A graph G consists of a non-empty set of elements, V, called the set of _vertices_ or nodes, and a multi-set (bag), E, of non-ordered pairs of vertices, called the **edges**

> **Example**
>
> G = <V,E>
>
> V = {a, b, c, d, e}
>
> E = {(a,b), (a,c), (a, d), (a, e), (b, c), (c, d), (c, e)}

## Terms

- **Adjacent vertices:** Two vertices v and w of a graph are adjacent if (v, w) (or (w, v)) is an edge of a graph UNDIRECTED
- **Vertex incident to an edge:** A vertex v on an edge e is called incident to that edge
- **Degree of a vertex:** The degree of a vertex, v, deg(v): number of edges incident to v
- **Path:** just a sequence of edges that connects two nodes (vertices)
- **Loop:** edge from a vertex to a itself
- **Simple graph:** doesn't have multiple edges connecting to a node

## Representations

- **Adjacency Matrix:** rows and columns are made by vertices (can be **Weighted**, the value stored inside the matrix has some importance NOT JUST TRUE OR FALSE)
- **Adjacency List:** each node a list of the nodes that you can go to (from it)

## Sparse vs. Dense

- **Sparse:** Not a lot of edges connecting each node -> Adjacency List (doesn't waste so much space, only uses what you need)
- **Dense:** a lot of edges or connections between nodes -> Adjacency Matrix

## Graph Traversals

- **Breadth-first Traversal:** visit all adjacent vertices first (equivalent to "by-levels" traversal of a binary tree). Search outward from a vertex and expand the search space more "evenly"
  - Can be used to search! **Breath First Search (or BFS)**
  - Implemented using **queues**! Mark visited nodes -> Boolean Array (avoid infinite loop)
