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
        ListNode resultList = new ListNode();
        ListNode tail = resultList;

        while (list1 != null || list2 != null) {
            int val = 0;

            if (list2 == null) {
                ListNode nextNode = list1;
                resultList.next = nextNode;
                break;
            } else if (list1 == null) {
                ListNode nextNode = list2;
                resultList.next = nextNode;
                break;
            } else {
                int valOne = list1.val;
                int valTwo = list2.val;

                if (valOne < valTwo) {
                    resultList.next = list1;
                    list1 = list1.next; 
                } else {
                    resultList.next = list2;
                    list2 = list2.next; 
                }
            }

            resultList = resultList.next;
        }

        return tail.next;
    }
}