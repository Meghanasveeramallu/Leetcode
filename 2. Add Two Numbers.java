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
        ListNode temp = null;
        ListNode root = null;
        if (l1 == null && l2 == null) {
            return new ListNode(0);
        }
        boolean carry = false;
        int sum = 0;
        while(l1 != null || l2 != null) {
            if(carry) {
                sum++;
                carry = false;
            }
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum >= 10) {
                sum -= 10;
                carry = true;
            }
            if (temp == null) {
                temp = new ListNode(sum);
                root = temp;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            sum = 0;
        }
        if (carry) {
            temp.next = new ListNode(1);
        }
        return root;
    }
}
