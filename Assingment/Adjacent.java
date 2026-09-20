import java.util.*;

        class Node {
        Node left;
        Node right;
        char data;

        public Node(char data){
            this.data = data;
        }
        public Node(char data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    class Graph2 {
        int[][]matrix;
        ArrayList<Node> nodes;
        Graph2(int size){
            nodes = new ArrayList<>();
            matrix = new int[size][size];
        }

        public void addNode(Node node){
            nodes.add(node);
        }

        public void addEdge(int src, int dst){
            matrix[src][dst] = 1;
        }

        public void print(){
            System.out.print("  ");
            for(Node n1:nodes) {
                System.out.print(n1.data + " ");
            }
            System.out.println();
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix.length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public class Adjacent{
    
    public static void main(String[] args) {
        Graph2 g1 = new Graph2(6);
        g1.addNode(new Node('A'));
        g1.addNode(new Node('B'));
        g1.addNode(new Node('C'));
        g1.addNode(new Node('D'));
        g1.addNode(new Node('E'));
        g1.addNode(new Node('F'));
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 3);
        g1.addEdge(1, 0);
        g1.addEdge(2, 4);
        g1.addEdge(2, 5);
        g1.print();
    }
    
} 