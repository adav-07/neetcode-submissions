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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode head2=slow.next;
        slow.next=null;
        ListNode prev=null, curr=head2, next;
        while(curr!=null){
            next=curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        ListNode start1=head,start2=prev;
        ListNode ret=start1,ptr=ret;
        start1=start1.next;
        while(start2!=null && start1!=null){
            ret.next=start2;
            start2=start2.next;
            ret=ret.next;

            ret.next=start1;
            start1=start1.next;
            ret=ret.next;
        }
        head=ptr;
    }
}
