// 21. Merge two sorted lists
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode phead = new ListNode(-1);
        ListNode ans = phead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                ans.next = l1;
                l1 = l1.next;
            }
            else{
                ans.next = l2;
                l2 = l2.next;
            }
            ans = ans.next;
        }
        ans.next = l1 == null? l2:l1;
        return phead.next;//not from phead, but from phead.next we included -1 as first
    }
}
