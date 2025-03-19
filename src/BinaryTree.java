import java.util.Objects;

public class BinaryTree {
    private NodeBinaryTree root = null;
    private BinaryTree left = null;
    private BinaryTree right = null;

    public BinaryTree(NodeBinaryTree node) {
        this.root = node;
    }

    public void insert(int value) {
        NodeBinaryTree newNode = new NodeBinaryTree(value);

        if (Objects.isNull(this.root)) {
            this.root = new NodeBinaryTree(value);
        } else {
            if (newNode.getValue() < this.root.getValue()) {
                if (this.left == null) {
                    this.left = new BinaryTree(newNode);
                } else {
                    this.left.insert(value);
                }
            } else {
                if (this.right == null) {
                    this.right = new BinaryTree(newNode);
                } else {
                    this.right.insert(value);
                }
            }
        }
    }

    public boolean search(int value) {
        if (this.root == null) {
            return false;
        }

        if (this.root.getValue() == value) {
            return true;
        }

        BinaryTree node = this;

        while (node.root != null) {
            if (value < node.root.getValue()) {
                if (node.left == null) {
                    return false;
                } else {
                    node = node.left;
                    if (node.root.getValue() == value) {
                        return true;
                    }
                }
            } else if (value > node.root.getValue()) {
                if (node.right == null) {
                    return false;
                } else {
                    node = node.right;
                    if (node.root.getValue() == value) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

class NodeBinaryTree {
    private Integer value;

    public NodeBinaryTree(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
