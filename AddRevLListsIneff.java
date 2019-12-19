/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddRevLListIneff {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int mult = 1;
        int sum1 = 0;
        int sum2 = 0;
        if(l1.next == null)
            sum1 = l1.val;
        if(l2.next == null)
            sum2= l2.val;
        while(l1.next != null){
            sum1 = sum1 + l1.val * mult;
            mult = mult*10;
            l1=l1.next;          
        }
        mult = 1;
        while(l2.next != null){
            sum2 = sum2 + l2.val*mult;
            mult = mult*10;
            l2=l2.next;            
        }
        sum1 = sum1 + sum2;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(sum1 >= 0)
        {                              
                curr.next = new ListNode(sum1%10);                                 
                sum1 = sum1/10;
                curr = curr.next;                        
        }    
        return head.next;
    }
}

