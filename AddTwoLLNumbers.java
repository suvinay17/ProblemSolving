/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoLLNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(-1);
    ListNode curr = head;
    int a, b;
    int carry = 0;
    while (l1 != null || l2 != null) 
    {
        if(l1 != null)
            a = l1.val;
        else
            a = 0;
        if(l2 != null)
            b = l2.val;
        else
            b = 0;
        int sum = carry + a + b;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (l1 != null)
            l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return head.next;
}
}

