# Binary Trees

> There are two branches, the left or right sub tree

## Terms

- **Subtrees**: Right or Left children nodes
- **Root:** origin of the tree
- **Children:** left or right Nodes
- **Siblings:** Children at the same level
- **Leaf:** doesn't have left or right subtrees (children)
- **Height:** Length of the largest path between the `Node` and the `Leaf`
- **Depth:** Number of edges from the `Node` to the `Root` (only 1 path)

## Traversal

> visit substrees recursively

1. **Preorder:** parent->left->right
2. **Inorder:** left->parent->right
3. **Postorder:** left->right->parent

## 1. Example Traversal

```bash
            7
        /       \
       8        37
        \     /     \
        19   16      1
            /
           27
```

- **Preorder:** 7, 8, 19, 37, 16, 27, 1
- **Inorder:** 8, 19, 7, 27, 16, 37, 1
- **Postorder:** 19, 8, 27, 16, 1, 37, 7

## 2. Example Traversal

```bash
            25
        /       \
       10        37
        \       /    \
        15     29     42
       /   \     \
      11    17    27
```

- **Preorder:** 25, 10, 15, 11, 17, 37, 29, 27, 42
- **Inorder:** 10, 11, 15, 17, 25, 29, 27, 37, 42
- **Postorder:** 11, 17, 15, 10, 27, 29, 42, 37, 25

## Types of Trees

- **BST** (Binary Search Tree)
- AVL (Balanced AVL)
- Splay
- Red-black trees
- B-Trees
- more...
