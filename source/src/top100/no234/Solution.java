package top100.no234;

import java.util.ArrayList;

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
        ArrayList<Integer> integers = new ArrayList<>();
        while(head != null){
            integers.add(head.val);
            head = head.next;
        }

        int i = 0,j = integers.size() - 1;

        while(i < j){
            if(integers.get(i) != integers.get(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}