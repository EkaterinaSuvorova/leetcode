//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
//2807. Insert Greatest Common Divisors in Linked List
public class InsertGreatestCommonDivisors {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next != null) {
            insertGSD(head, head.next);
        }
        return head;
    }

    public void insertGSD(ListNode a, ListNode b) {
        a.next = new ListNode(findGCD(a.val, b.val), b);
        if (b.next != null) {
            insertGSD(b, b.next);
        }
    }

    public static int findGCD(int a, int b) {
        // Base case: if b is 0, return a as the GCD
        if (b == 0) {
            return a;
        }
        // Recursive case: calculate GCD of b and a % b
        return findGCD(b, a % b);
    }
}
