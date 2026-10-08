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

        while(list1 != null || list2 != null) {
            if (list1 == null) {
                head.next = list2;
                break;
            } 

            if (list2 == null) {
                head.next = list1;
                break;
            }

            if (list1.val > list2.val) {
                ListNode newNode = new ListNode(list2.val);
                head.next = newNode;
                list2 = list2.next;
            } else {
                ListNode newNode = new ListNode(list1.val);
                head.next = newNode;
                list1 = list1.next;
            }

            head = head.next;
        }

        return result.next;
    }
}