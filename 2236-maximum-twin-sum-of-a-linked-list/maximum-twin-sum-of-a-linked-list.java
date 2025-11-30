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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow);
        ListNode first = head;
        int twinsum = 0;

        while(second != null){
            twinsum = Math.max(twinsum , first.val + second.val);
            first = first.next;
            second = second.next;
        }
    return twinsum;      
    }

    private ListNode reverse (ListNode head){
        ListNode prev = null;
        while(head!= null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}