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
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null) return null;

        ListNode a = head;
        ListNode b = head;
        ListNode t = head; 

        for (int i = 1; i < k; i++) {
            a = a.next;
        }

        for (int i = 0; i < k; i++) {
            t = t.next;
        }

        while (t != null) {
            t = t.next;
            b = b.next;
        }

        int temp = a.val;
        a.val = b.val;
        b.val = temp;

        return head;
    }
}
