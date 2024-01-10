// 234.Palindrome linked list
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode slow = head,fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode firsthalf = head;
        ListNode secondhalf = reverseList(slow.next);

        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val)
                return false;
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head){
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
