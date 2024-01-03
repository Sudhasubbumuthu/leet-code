//206. Reverse Linked List
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode nextnode;
        while(cur != null){
            nextnode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextnode;
        }
        return prev;
    }
}
