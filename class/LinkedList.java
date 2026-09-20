public class LinkedList {
   public static class Node {
    int data;
    Node next;

    public Node (int data) {
        this.data =data;
        this.next = null;
    }
   }
   public static Node head;
   public static Node tail;

   public static void addFirst(int data) {
    Node newNode = new Node(data);
    if(head == null) {
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
   }


   public static void print(){
     Node temp = head;
     while(temp!=null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
     }
     System.out.println("null");
   }

   public static void addLast(int data) {
    Node newnode = new Node(data);
   }

   public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.print();
    
   }
    
}
