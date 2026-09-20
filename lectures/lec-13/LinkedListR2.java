
public class LinkedListR2 {
    class Node{
        int data;
        Node next;
        public Node(int data){  // constructor 
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print Function
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // add in the middle
    public void add(int data, int idx){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // search Ityeractive
    public int Search(int key){
        Node temp = head;
         int i=0;
         while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
         }
         return -1;
    }

    // Rverse linked list
    public void Reverse(){
        if(head == null || head.next == null){
            return;
        }
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }


    // check if a linked list is a pallindrome

    public boolean CheckPallindrone(){
        if(head == null || head.next==null){
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);
        // step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // step-3 check both the half

        while(right != null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean CheckCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast){
                return true; // cycle exist
            }
        }
        return false;
    }

  public static void main(String[] args) {
        LinkedListR2 ll = new LinkedListR2(); // apni linked list ko create kia hai
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
       // ll.add(9,3);
       // ll.print();
        //System.out.println(ll.Search(4));
       // ll.Reverse();
       // ll.print();
        System.out.println(ll.CheckPallindrone());
       
    }
    
}
