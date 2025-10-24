package search_algorithm;


public class MergeListsRunner {

    // 1. ListNode Class Definition (Required for the code to run)
    // LeetCode provides this, but you need it in a local file.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 2. Your Solution Class (Copied directly from your prompt)
    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if(list1 == null) return list2;
            if(list2 == null) return list1;

            if(list1.val > list2.val){
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            } else {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
        }
    }

    // 3. Main method to run and test the code
    public static void main(String[] args) {

        // --- Setup: Create list1 [1, 2, 4] ---
        ListNode l1_node3 = new ListNode(4);
        ListNode l1_node2 = new ListNode(2, l1_node3);
        ListNode list1 = new ListNode(1, l1_node2);

        // --- Setup: Create list2 [1, 3, 4] ---
        ListNode l2_node3 = new ListNode(4);
        ListNode l2_node2 = new ListNode(3, l2_node3);
        ListNode list2 = new ListNode(1, l2_node2);

        System.out.println("List 1:");
        printList(list1); // Output: 1 -> 2 -> 4 -> NULL

        System.out.println("List 2:");
        printList(list2); // Output: 1 -> 3 -> 4 -> NULL

        // --- Execution: Run your solution ---
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // --- Verification: Print the result ---
        System.out.println("Merged List:");
        printList(mergedList); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> NULL
    }

    // 4. Helper function to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}