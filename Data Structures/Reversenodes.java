//https://leetcode.com/problems/reverse-nodes-in-k-group/


class Reversenodes
 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null;
        int Listlength = 1;
        ListNode temp = head;
        while(temp.next!=null){
            Listlength++;
            temp = temp.next;
        }
        if(Listlength<k) return head;
        int totalNodes = k;
        ListNode nextHead = head;
        ListNode reverseEnd = null;

        while(nextHead!=null && totalNodes-->0){
            reverseEnd = nextHead;
            nextHead = nextHead.next;
        }
        if(reverseEnd!=null) reverseEnd.next = null;
        reverseList(head);
        ListNode resolvedList = reverseKGroup(nextHead, k);

        head.next = resolvedList;

        return reverseEnd;

    }
    public void reverseList(ListNode head){
        ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){
            head = temp.next;
            temp.next = prev;
            prev = temp;
            temp = head;
        }
    }
}