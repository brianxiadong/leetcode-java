//package top100.no142;
//
//import java.util.HashMap;
//import java.util.HashSet;
//
///**
// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        HashSet<ListNode> set = new HashSet<ListNode>();
//        while(head != null){
//            if(set.contains(head)){
//                return head;
//            }
//            set.add(head);
//            head = head.next;
//        }
//
//        return null;
//    }
//}