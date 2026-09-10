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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode ptr1=head;

        while(ptr1!=null && ptr1.next!=null){
            if(ptr1.val==ptr1.next.val){
                ptr1.next=ptr1.next.next;
            }
            else{
                ptr1=ptr1.next;
            }
  
        }
        return head;
    }
}