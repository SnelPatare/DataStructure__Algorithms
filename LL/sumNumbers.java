package LL;

public class sumNumbers {

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public ListNode solution(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry =0;
        while(l1 != null || l2 != null || carry !=0){
            int x = (l1 != null)? l1.val :0;
            int y = (l2 != null)? l2.val :0;
            int sum = carry + x+y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;

            l1 = l1.next;
            l2 = l2.next;

        }
        return dummy;

    }

    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        sumNumbers obj = new sumNumbers();
        printList(obj.solution(list1, list2));
    }
        

    
}
