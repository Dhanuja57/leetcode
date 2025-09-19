class Solution {
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);

        ListNode cur = head;
        ListNode prev = null;
        int carry = 0;

        while (cur != null) {
            int val = cur.val * 2 + carry;
            cur.val = val % 10;
            carry = val / 10;
            prev = cur;
            cur = cur.next;
        }
        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }
}
