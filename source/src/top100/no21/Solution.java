package top100.no21;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode now = null;


        while (list1 != null || list2 != null) {
            if (list1 != null && (list2 == null || list1.val < list2.val)) {
                if (head == null) {
                    now = head = list1;
                } else {
                    now.next = list1;
                    now = now.next;
                }
                list1 = list1.next;
            } else {
                if (head == null) {
                    now = head = list2;
                } else {
                    now.next = list2;
                    now = now.next;
                }
                list2 = list2.next;
            }
        }
        return head;
    }
}