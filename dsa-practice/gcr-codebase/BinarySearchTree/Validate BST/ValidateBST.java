public class ValidateBST {

    public boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(Node node, long min, long max) {

        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val)
                && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);

        ValidateBST obj = new ValidateBST();

        System.out.println(obj.isValidBST(root));
    }
}