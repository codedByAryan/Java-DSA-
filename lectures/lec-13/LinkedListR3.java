// Linked list revision

public class LinkedListR3 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node size;

    // addfirst
    public void addfirst(int data){
        // create a node
        Node newNode = new Node(data);
        if(head == null){
            head  = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head  = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print a linked list
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp =temp.next;
        }
        System.out.println("null");
    }

    // Add in the middle
    public void add(int data, int index){
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        // linking
        newNode.next = temp.next;
        temp.next = newNode;
    }

    
    // Remove from first
    public int Removefirst(){
        int val = head.data;
        head = head.next;
        return val;
    }

    // Remove from last
    // public int RemoveLast(){
    //     Node prev = head;
    //     for(int i=0; i<size-2; i++){
    //         prev = prev.next;
    //     }
    //     int val = prev.next.data; // tail.data
    //     prev.next = null;
    //     tail = prev;
    //     return val;
    // }

    // Reveverse the linked list
    public void Reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        LinkedListR3 ll = new LinkedListR3();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
       // ll.add(9,3);
       // ll.Removefirst();
       ll.Reverse();
        ll.print();
    }
    
}
