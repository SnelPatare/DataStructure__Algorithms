package LL;

public class reorderLL {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public void reorderList(ListNode head) {
        ListNode f = head;
        ListNode s = head.next;
        while(s != null && s.next!= null){
            f = f.next;
            s= s.next.next;
        }
        ListNode curr = f.next;
        f.next = null;
        ListNode prev = null;
        while(curr!= null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode first = head;
        ListNode second = prev;
        while(second!= null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
        
    }

    public static void printlist(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.val + " ");
            curr = curr.next; 
        }
        System.out.println();
    }

    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(2);

        printlist(list1);
        reorderLL obj = new reorderLL();
        obj.reorderList(list1);
        printlist(list1);

    }
}

