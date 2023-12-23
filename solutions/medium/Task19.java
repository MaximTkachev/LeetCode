package solutions.medium;

import util.ListNode;

public class Task19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode savedHead = head;
        ListNode pointer = head;
        while (head != null) {
            if (n == -1) {
                pointer = pointer.next;
            } else {
                n--;
            }

            head = head.next;
        }

        if (n == -1) {
            pointer.next = pointer.next != null ? pointer.next.next : null;
            return savedHead;
        } else {
            return savedHead.next;
        }
    }
}
