//package top100.no2;
//
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode pre = null;
//        ListNode cur = null;
//        int carry =  0;
//
//        while(l1 != null || l2 != null){
//            int i1 = l1 == null ? 0 : l1.val;
//            int i2 = l2 == null ? 0 : l2.val;
//
//            int sum = i1 + i2 + carry;
//            carry = sum / 10;
//            sum = sum % 10;
//
//            ListNode temp = new ListNode(sum);
//            if(pre == null){
//                pre = temp;
//                cur = pre;
//            }else{
//                cur.next = temp;
//                cur = temp;
//            }
//
//            l1 = l1 == null ? null : l1.next;
//            l2= l2 == null ? null : l2.next;
//        }
//
//        if(carry > 0){
//            cur.next = new ListNode(1);
//        }
//
//        return pre;
//    }
//}