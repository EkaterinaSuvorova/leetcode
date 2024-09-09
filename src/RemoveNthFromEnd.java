//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthFromEnd {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,  new ListNode(4,  new ListNode(5)))));
//        System.out.println(removeNthFromEnd(head, 2));
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        removeNthFromEnd(head, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        ListNode current = head;
        int size = 1;
        int step = 0;

        while (current.next != null) {
            current = current.next;
            if (step == n) {
                start = start.next;
            } else {
                step++;
            }
            size++;
        }
        if (n == 1) {
            if (current == head) {
                return null;
            }
            start.next = null;
        } else if (start == head && n == size) {
            head = head.next;
        } else {
            start.next = start.next.next;
        }
        return head;
    }
}
