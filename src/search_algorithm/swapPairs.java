package search_algorithm;




//递推~~
//class Solution {
//
//
//    // 两两交换链表中的节点~~
//    public ListNode swapPairs(ListNode head) {
//
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//
//        ListNode temp = dummyHead;
//        while (temp.next != null && temp.next.next != null) {
//            ListNode node1 = temp.next;
//            ListNode node2 = temp.next.next;
//            temp.next = node2;
//            node1.next = node2.next;
//            node2.next = node1;
//            temp = node1;
//        }
//        return dummyHead.next;
//
//    }
//}




//递归
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//
//        if(head ==null || head.next == null){
//            return head;
//        }
//
//        ListNode tmp = swapPairs(head.next.next);
//        ListNode ret =head.next;
//        ret.next = head;
//        head.next = tmp ;
//
//        return ret;
//
//    }
//}






public class swapPairs {
}
