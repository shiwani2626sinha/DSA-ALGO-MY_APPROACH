/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode head = new ListNode();
        ListNode temp = new ListNode();
        sum = l1.val+l2.val;
        if(sum>=10)
        {
            head.val=sum%10;
            carry=sum/10;
        }
        else 
            head.val = sum;
        head.next=null;
        temp=head;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null && l2!=null)
        {
           
            
            sum = l1.val+l2.val+carry;
            carry=0;
            if(sum>=10)
            {
                
                  temp.next=new ListNode(sum%10,null);
                  carry=sum/10;
            }
            else{
                temp.next=new ListNode(sum,null);
            }
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
            
        }
        if(l1==null && l2!=null)
        {
            while(l2!=null)
            {
                 sum = l2.val+carry;
                 carry=0;
                 if(sum>=10)
                {
                
                    temp.next=new ListNode(sum%10,null);
                    carry=sum/10;
                 }
            else{
                temp.next=new ListNode(sum,null);
            }
            temp=temp.next;
            l2=l2.next;
            }
        }
        else if(l2==null && l1!=null)
        {
            while(l1!=null)
            {
                 sum = l1.val+carry;
                 carry=0;
                if(sum>=10)
                {
                
                   temp.next=new ListNode(sum%10,null);
                   carry=sum/10;
                }
            else{
                temp.next=new ListNode(sum,null);
            }
            temp=temp.next;
            l1=l1.next;
            }
        }
        if(carry!=0)
            temp.next=new ListNode(carry);
        return head;
        
    }
}
