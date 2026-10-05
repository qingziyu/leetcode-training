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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode result = head;
        int pointerOne = 0;
        int pointerTwo = 0;

        while(list1.next != null && list2.next != null) {
            int nodeVal;

            if (list1.next == null) {
                nodeVal = list2.val;
                list2 = list2.next;
            }

            if (list2.next == null) {
                nodeVal = list1.val;
                list1 = list1.next;
            }

            int curOneNum = list1.val;
            int curTwoNum = list2.val;
            if (curOneNum > curTwoNum) {
                nodeVal = curTwoNum;
                list2 = list2.next;
            } else {
                nodeVal = curOneNum;
                list1 = list1.next;
            }

            ListNode newNode = new ListNode();
            newNode.val = nodeVal;
            head.next = newNode;
            head = newNode;
        }

        return result;
    }
}