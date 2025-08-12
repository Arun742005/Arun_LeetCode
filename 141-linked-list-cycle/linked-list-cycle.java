/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       List<ListNode> visited = new ArrayList<>();
       ListNode current = head;

       while(current != null){
            if(visited.contains(current)){
                 return true;
            }
            visited.add(current);
            current = current.next;

       }
       return false;
    }
}