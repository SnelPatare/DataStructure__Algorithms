package LL;

import Implement_LL.linkList;

public class mergeLL {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while(list1!= null && list2 != null){
            if(list1.val< list2.val){
                node.next = list1;
                list1=list1.next;
            }else{
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if(list1 != null){
            node.next = list1;
        }else{
            node.next = list2;
        }

        return dummy.next;
        
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }



    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);


        mergeLL obj = new mergeLL();
        printList(list1);
        printList(list2);
        printList(obj.mergeTwoLists(list1, list2));
        


    }

}
    

