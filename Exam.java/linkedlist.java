public class linkedlist {
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
    
    // Add First
    public void addFirst(int data){
        Node newNode =  new Node(data); // craete new Node
        if( head == null ){
            head = tail = newNode;
            return;
        }
        newNode.next = head;  // linking
        head = newNode; // update head
    }
    
    // Add last
    public void addLast(int data){
        Node newNode = new Node(data); // craete new Node
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // linking at last
        tail = newNode;  // update tail
    }
    
    // print linked list
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
       System.out.println("null");
    }    
     //  Add in the Middle
    public void AddMiddle(int idx, int data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("ll is empty");
        }
        int i = 0;
        Node temp = head;
        while(i<idx-1){
            temp = temp.next;
            i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
    public static void main(String[] args){
        linkedlist ll = new linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addLast(13);
        ll.addLast(14);
        //ll.print();
        ll.AddMiddle(9, 3);
        ll.print();
    }
    
}
