import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode temp3 = l1;

        while(temp1!=null){
            s1.append(temp1.val);
            temp1 = temp1.next;
        }

        while(temp2!=null){
            s2.append(temp2.val);
            temp2 = temp2.next;
        }

        s1.reverse();
        s2.reverse();

        BigInteger n1 = new BigInteger(s1.toString());
        BigInteger n2 = new BigInteger(s2.toString());
        n1=n1.add(n2);

       ListNode prev = null; 

       while (n1.compareTo(BigInteger.ZERO) > 0) {
       BigInteger[] divideAndRemainder = n1.divideAndRemainder(BigInteger.TEN);
       int d = divideAndRemainder[1].intValue();
       n1 = divideAndRemainder[0];

    if (temp3!=null) {
        temp3.val = d;
        prev = temp3;       
        temp3 = temp3.next; 
    } else {
        ListNode newNode = new ListNode(d);
        prev.next = newNode; 
        prev = newNode;     
    }
}


if (prev != null) {
    prev.next = null;
}

return l1;

    }


}