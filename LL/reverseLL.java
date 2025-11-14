package LL;




public class reverseLL {
   public static class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
   }

    public static Node reverList(Node head){
        Node prev = null; 
        Node curr = head;
        while(curr!= null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
        
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("original ll");
        printList(head);
        System.out.println("modififed ll");
        Node reversedhead = reverList(head);
        printList(reversedhead);


    }


    
}
