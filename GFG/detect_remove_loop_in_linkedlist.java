//Given a linked list of N nodes such that it may contain a loop.

//A loop here means that the last node of the link list is connected to the node at position X. If the link list does not have any loop, X=0.

//Remove the loop from the linked list, if it is present

//sol 1 - not optimsed 
/*
class Solution {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];
       int fast = nums[0];
        
       do{
           slow = nums[slow];
           fast = nums[nums[fast]];
       }while(slow!=fast);
        
       fast = nums[0];
       while(slow!=fast)
       {
           slow = nums[slow];
           fast = nums[fast];
       }
        
        return slow;
        
    }
}
*/

// OPTIMISED SOLUTION
