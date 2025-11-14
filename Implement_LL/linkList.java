package Implement_LL;
import java.io.*;

public class linkList {
    
        Node head;

        static class Node{
            int data;
            Node next;
        

        Node (int d){
            data = d;
            next = null;
        }
    }

// Method to insert data into linkedlist
public static linkList insert(linkList list, int data){
    Node new_node = new Node(data);
    if(list.head == null){
        list.head = new_node;
    }
    else{
        Node last = list.head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
    }
    return list;
}

// Print Linkedlist
public static void printList(linkList list){
    Node currNode = list.head;
    System.out.print("Ll:");
    while (currNode != null){
        System.out.println(currNode.data+ " ");
        currNode = currNode.next;
    }
}

// Delete node
public static linkList deletekey(linkList list, int key){
    Node currNode = list.head;
    Node prev = null;
    if (currNode != null && currNode.data == key){
        list.head = currNode.next;
        return list;
    }
    while(currNode != null && currNode.data != key){
        prev = currNode;
        currNode = currNode.next;
    }
    if (currNode != null){
        prev.next = currNode.next;
    }

    return list;
}

public static void main(String[] args){
    linkList ll = new linkList();
    ll = insert(ll, 1);
    ll = insert(ll, 2);
    ll = insert(ll, 3);
    ll = insert(ll, 4);
    printList(ll);
    deletekey(ll, 3);
    printList(ll);

}
}
