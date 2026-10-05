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
        if (head.next == null) {
            return false;
        }

        Set<ListNode> seenNodes = new HashSet<>();

        while (head != null) {
            if (seenNodes.contains(head)) {
                return true;
            }

            seenNodes.add(head);
            head = head.next;
        }

        return false;
    }
}