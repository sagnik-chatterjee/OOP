public class SinglyLinkedList {
    private Node head;  // Head is the first node in linked list

    public boolean isEmpty(){
        return length() == 0;
    }
 
    public void append(T data){
        if(head == null){
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }
 
    private Node tail() {
        Node tail = head;
     
        // Find last element of linked list known as tail
        while(tail.next != null){
            tail = tail.next;
        }      
        return tail;
     
    }
 

 
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while(current != null){
           sb.append(current).append("--&gt;");
           current = current.next;
        }    
        if(sb.length() &amp;gt;=3){
            sb.delete(sb.length() - 3, sb.length());
            // to remove --&gt; from last node
        }
     
        return sb.toString();
    }

    public int length() {
       int length = 0;
       Node current = head;  // Starts counting from head - first node
       while(current != null){
           length ++;
           current = current.next;
       }
       return length;
    }

    private static class Node {
        private Node next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}

public class ll {

    public static void main(String args[]) {

        // Creating Singly linked list in Java of String type
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append("Java");
        singlyLinkedList.append("JEE");
        singlyLinkedList.append("Android ");
        //singlyLinkedList.append(2); // compile time error
     
        System.out.println("Singly linked list contains : " 
                               + singlyLinkedList);
        System.out.println("length of linked list : " 
                               + singlyLinkedList.length());
        System.out.println("is this linked list empty : " 
                               + singlyLinkedList.isEmpty());
     
        SinglyLinkedList iList = new SinglyLinkedList();
        iList.append(202);
        iList.append(404);
        //iList.append("one"); // compilation error 
                               // Trying to insert String on integer list
        System.out.println("linked list : " + iList);
        System.out.println("length : " + iList.length());
    }
 
}