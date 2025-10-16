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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode h1=list1;
        ListNode start=h1;
        ListNode end=h1;
        for(int i=0;i<a-1;i++){
            start=start.next;
        }
        for(int i=0;i<b+1;i++){
             end=end.next;
        }
         start.next=list2;
        ListNode h2=list2;
        
        while(h2.next!=null){
            h2=h2.next;
        }
        h2.next=end;
        return h1;
    }
}