# Directed Graphs

> A directed graph, or digraph, D, consists of a non empty set of element, V, called the set of vertices or nodes, and a multiset (bag), E, of ORDERED pairs of vertices, called the edges or arch
>
> Notation: D = <V,E>
>
> **Operations:** addVertex(v), removeVertex(v), addEgde(e),
> removeEdge(e), findAdjVerticies(v), getValue(v), getWeight

## Traversals: Depth First Traversal (DFT)

- Visits a vertex v, then a neighbor v, then neighbor of the neighbor, etc. When it can't continue, it backs up and considers another neighbor (**stack**) -> pre-order traversal of a binary tree
  - Can be used to search **(Depth First Search or DFS)**
