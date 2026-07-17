public class BSTDelete {

    public Node delete(Node node, int value) {

        if (node == null) {
            return null;
        }

        if (value < node.val) {
            node.left = delete(node.left, value);
        } else if (value > node.val) {
            node.right = delete(node.right, value);
        } else {

            if (node.left == null && node.right == null) {
                return null;
            }

            if (node.left == null) {
                return node.right;
            }

            if (node.right == null) {
                return node.left;
            }

            Node successor = node.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            node.val = successor.val;

            node.right = delete(node.right, successor.val);
        }

        return node;
    }

    public void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        BSTDelete tree = new BSTDelete();

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        root = tree.delete(root, 50);

        tree.inorder(root);
    }
}