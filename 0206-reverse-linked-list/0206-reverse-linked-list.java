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
    public ListNode reverseList(ListNode head) {
    ListNode slow=head,left=null,right;
    while(slow!=null){
        right=slow.next;
        slow.next=left;
        left=slow;
        slow=right;
    }
    return left;
    }
}
