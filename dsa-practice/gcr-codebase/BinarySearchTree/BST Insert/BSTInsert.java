public class BSTInsert {

    public Node insert(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.val) {
            node.left = insert(node.left, value);
        } else if (value > node.val) {
            node.right = insert(node.right, value);
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

        BSTInsert tree = new BSTInsert();

        Node root = null;

        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);

        tree.inorder(root);
    }
}