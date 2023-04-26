//https://leetcode.com/problems/swap-nodes-in-pairs/


class Swapnodes {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = head.next.next;
        ListNode prev = head;
        head = head.next;
        head.next = prev;
        while(node != null && node.next != null) {
            prev.next = node.next;
            prev = node;
            ListNode next = node.next.next;
            node.next.next = node;
            node = next;
        }
        prev.next = node;
        return head;
    }
}