// Tree Traversal (a) Preorder
/* [1] Root
 * [2] Left subtree
 * [3] Right subtree
 */

public class Transversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int Node[]){
            idx++;
            if(Node[idx] == -1){
                return null;
            }
            Node newNode = new Node(Node[idx]);
            newNode.left = buildTree(Node);
            newNode.right = buildTree(Node);

            return newNode;
        }

        // preorder 
        public static void Preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.Preorder(root);
    }
}
