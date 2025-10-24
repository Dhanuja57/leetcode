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
    int find_gcd(int a,int b){
        while(b!=0){
           int temp=b;
           b=a%b;
           a=temp;

        }
        return a;

    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode a=head;
        ListNode b=head.next;
        while(b!=null){
            ListNode nn=new ListNode();
            nn.val=find_gcd(a.val,b.val);
            nn.next=b;
            a.next=nn;
            a=a.next.next;
            b=b.next;
        }
        return head;
    }
}