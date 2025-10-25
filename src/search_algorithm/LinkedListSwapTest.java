package search_algorithm;

public class LinkedListSwapTest {

    // 1. 定义链表节点 (ListNode)
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 2. 这是你提供的 Solution 类（完全没动）
    static class Solution {

        // 两两交换链表中的节点~~
        public ListNode swapPairs(ListNode head) {

            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;

            ListNode temp = dummyHead;
            // 循环条件：temp 后面必须至少还有两个节点
            while (temp.next != null && temp.next.next != null) {
                // 识别
                ListNode node1 = temp.next;
                ListNode node2 = temp.next.next;

                // 交换 (重点)
                // 1. temp 指向 node2
                temp.next = node2;
                // 2. node1 指向 node2 的下一个节点
                node1.next = node2.next;
                // 3. node2 指向 node1
                node2.next = node1;

                // 移动 temp 指针，准备下一轮
                // 此时 node1 是交换后 "后面" 的那个节点
                temp = node1;
            }
            return dummyHead.next;
        }
    }

    // 3. main 方法，用于测试
    public static void main(String[] args) {

        // --- 创建测试用例 ---
        // 示例 1: 1 -> 2 -> 3 -> 4
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        // 示例 2: 1 -> 2 -> 3 (奇数个)
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        // 示例 3: [1] (单个节点)
        ListNode head3 = new ListNode(1);

        // 示例 4: [] (空链表)
        ListNode head4 = null;

        // --- 执行测试 ---
        Solution solution = new Solution();

        System.out.println("--- 测试用例 1 [1,2,3,4] ---");
        System.out.print("交换前: ");
        printList(head1);
        ListNode newHead1 = solution.swapPairs(head1);
        System.out.print("交换后: ");
        printList(newHead1); // 预期: 2 -> 1 -> 4 -> 3

        System.out.println("\n--- 测试用例 2 [1,2,3] ---");
        System.out.print("交换前: ");
        printList(head2);
        ListNode newHead2 = solution.swapPairs(head2);
        System.out.print("交换后: ");
        printList(newHead2); // 预期: 2 -> 1 -> 3

        System.out.println("\n--- 测试用例 3 [1] ---");
        System.out.print("交换前: ");
        printList(head3);
        ListNode newHead3 = solution.swapPairs(head3);
        System.out.print("交换后: ");
        printList(newHead3); // 预期: 1

        System.out.println("\n--- 测试用例 4 [] ---");
        System.out.print("交换前: ");
        printList(head4);
        ListNode newHead4 = solution.swapPairs(head4);
        System.out.print("交换后: ");
        printList(newHead4); // 预期: (空)
    }

    // 4. 辅助函数：打印链表
    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("(空链表)");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}