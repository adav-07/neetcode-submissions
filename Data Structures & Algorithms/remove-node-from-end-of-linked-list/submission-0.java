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
    private ListNode reverse(ListNode head){
        ListNode prev=null, curr=head, next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=reverse(head);
        head=node;
        if(n==1){
            node=node.next;
            return reverse(node);
        }
        for(int i=2;i<n;i++){
            node=node.next;
        }
        node.next=node.next.next;
        return reverse(head);
    }
}
