package LL;

import java.util.HashMap;

class Node{
    int key;
    int val;
    Node prev;
    Node next;
    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev= null;
        this.next = null;
    }
}
public class LRUcache {

    private int cap;
    private HashMap<Integer, Node> cache;
    private Node left;
    private Node right;


    public LRUcache(int capacity){
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    private void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }


    public int get(int key){
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value){
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }

        Node newNode = new Node(key,value);
        cache.put(key, newNode);
        insert(newNode);
        if(cache.size()>cap){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }



        }

     public static void main(String[] args){
        LRUcache lru = new LRUcache(2);

        System.out.println("put(1,1)");
        lru.put(1,1);

        System.out.println("put(2,2)");
        lru.put(2,2);

        System.out.println("get(1) ➜ " + lru.get(1)); // returns 1 (moves key 1 to MRU)

        System.out.println("put(3,3)  // evicts key 2");
        lru.put(3,3);

        System.out.println("get(2) ➜ " + lru.get(2)); // returns -1 (2 was evicted)

        System.out.println("put(4,4)  // evicts key 1");
        lru.put(4,4);

        System.out.println("get(1) ➜ " + lru.get(1)); // returns -1 (1 was evicted)
        System.out.println("get(3) ➜ " + lru.get(3)); // returns 3
        System.out.println("get(4) ➜ " + lru.get(4)); // returns 4
    }


    
}
