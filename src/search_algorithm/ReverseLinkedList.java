package search_algorithm;

/**
 * 这是一个完整的、可运行的 Java 程序。
 * 它包含了你提供的 Solution 类，并添加了 ListNode 类的定义和一个 main 方法来测试它。
 */



public class ReverseLinkedList {

    /**
     * 1. 链表节点的定义
     * (这部分是根据你的注释实现的)
     */
    public static class ListNode {
        int val;
        ListNode next;
//      弄了三个构造方法~~
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * 2. 你的 Solution 类
     * (这部分代码与你提供的完全一致)
     */
    static class Solution {


//      反转链表的主要逻辑~~  通过使用递归，链表可以看作特殊的二叉树(只有一个分支的~~)
//      这样就可以通过后序遍历~~然后修改链表中的指向~~进而逆向了链表~~~
        public ListNode reverseList(ListNode head) {
            // 递归的出口~~
            if(head == null || head.next == null){
                return head;
            }
            ListNode newHead = reverseList(head.next);

            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    /**
     * 3. 程序的入口 main 方法
     * (这部分是新增的，用于测试)
     */
    public static void main(String[] args) {
        // 创建一个测试链表: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("原始链表:");
        printList(head);

        // 创建 Solution 实例并调用你的方法
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("反转后的链表:");
        printList(reversedHead);
    }

    /**
     * 4. 辅助方法：打印链表
     * (这部分是新增的，方便查看结果)
     */
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}