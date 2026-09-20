// Linked list first lecturte revision
public class LinkedListRevesion {
 class Node{  // Node class 
        int data;  
        Node next;
        public Node(int data){  // method node 
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add First in LinkedList

    public void addFirst(int data){
        //step1 -> create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step2 -> newnode ka next hai jo hmara head hai ushko point kre
        newNode.next = head;
        // step3 -> currnode ko head bnado
        head = newNode;
    }

    // Add node at last
    public void addLast(int data){
        // craete new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // tail ka next newnode ko point krega 
        tail.next = newNode;
        // new node ko tail bnana hai
        tail = newNode;
    }
    // print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add in middle
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int RemoveFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        ll.removeFirst();
        ll.print();
    }
    
}
