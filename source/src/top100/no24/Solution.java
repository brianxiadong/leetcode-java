//package top100.no24;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        ListNode pre = null,first = null;
//        if(head == null) return null;
//        if(head.next == null) return head;
//
//        //1 2 3 4
//        while(head != null && head.next != null){
//            ListNode a = head;
//            ListNode b = head.next;
//            if(first == null){
//                first = b;
//            }
//            ListNode next = b.next;
//            b.next = a;
//            a.next = next;
//            if(pre != null){
//                pre.next = b;
//            }
//            pre = a;
//            head = next;
//        }
//
//        return first;
//    }
//}