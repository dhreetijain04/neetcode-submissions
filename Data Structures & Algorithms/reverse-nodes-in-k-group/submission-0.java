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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = null;
        if (head == null || k <= 1) {
            return head;
        }
        while (true) {
            ListNode temp = curr;
            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return head;
                }
                temp = temp.next;
            }
            ListNode last = prev;
            ListNode newend = curr;
            ListNode next = curr.next;
            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newend.next = curr;
            if (curr == null) {
                break;
            }
            prev = newend;

        }
        return head;
    }
}