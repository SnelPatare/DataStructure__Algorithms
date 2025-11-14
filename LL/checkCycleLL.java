package LL;

import LL.mergeLL.ListNode;

public class checkCycleLL {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public boolean hasCycle(ListNode head) {
        if(head == null){ return false;}
        ListNode f = head;
        ListNode s = head.next;
        while(f!= s){
            if (s == null || s.next == null) {
                return false;
            }
            f = f.next;
            s = s.next.next;
        }
        return true;
    }
    public static void main(String[] args) {

        // ---------------------------
        // 1️⃣ List WITHOUT cycle: 1 → 2 → 3 → null
        // ---------------------------
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);

        // ---------------------------
        // 2️⃣ List WITH cycle:
        // 1 → 2 → 3 → 4
        //       ↑     |
        //       └─────┘
        // ---------------------------
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);

        // create cycle (node 4 → node 3)
        list2.next.next.next.next = list2.next.next;

        checkCycleLL obj = new checkCycleLL();

        System.out.println("List1 has cycle? " + obj.hasCycle(list1));  // false
        System.out.println("List2 has cycle? " + obj.hasCycle(list2));  // true
    }
    

    
}
