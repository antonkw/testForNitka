package com.nitka.first;

import static java.lang.Integer.max;

/**
 * Created by antonkw on 24.06.2015.
 */
public class Tree {
    public Node find(Node root, Integer x) {
        if (root == null)
            return null;
        if (root.getKey().equals(x))
            return root;
        if (root.getKey().compareTo(x) == 1) {
            return find(root.getRight(), x);
        } else {
            return find(root.getLeft(), x);
        }
    }

    public Node insert(Node root, Integer x) {
        if (root == null) {
            return new Node(x);
        }
        if (root.getKey().compareTo(x) == 1) {
            root.setRight(insert(root.getRight(), x));
        } else if (root.getKey().compareTo(x) == -1) {
            root.setLeft(insert(root.getLeft(), x));
        }
        return root;
    }

    public int height(Node root) {
        int heightOfLeftTree = 0, heightOfRightTree = 0;
        if (root == null) return (0);
        if (root.getLeft() != null) {
            heightOfLeftTree = height(root.getLeft());
        }
        if (root.getRight() != null) {
            heightOfRightTree = height(root.getRight());
        }
        return (max(heightOfLeftTree, heightOfRightTree) + 1);
    }
}

