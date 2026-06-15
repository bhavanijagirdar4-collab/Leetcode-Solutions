/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        int max1=0;
        if(head.next.next==null){
          return head.val+head.next.val;
        }else{
             ListNode slow = head, fast = head;

        while (fast.next != null 
               && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = reverseList(slow.next);
        slow.next = null;

        while(head!=null && head2!=null){
             max1 = Math.max(head.val+head2.val,max1);
             head=head.next;
             head2=head2.next;
        }

        }
        return max1;

    }
}