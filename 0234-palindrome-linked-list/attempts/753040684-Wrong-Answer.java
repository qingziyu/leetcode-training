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
    public boolean isPalindrome(ListNode head) {
        ListNode previousNode = null;
        Deque<Integer> stack = new ArrayDeque<>();

        while(head != null) {
            int curNum = head.val;
            stack.push(curNum);

            ListNode nextHead = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextHead;
        }

        while(head != null) {
            int curNum = head.val;
            if (curNum != stack.pop()) {
                return false;
            }

            head = head.next;
        }

        return true;
    }
}