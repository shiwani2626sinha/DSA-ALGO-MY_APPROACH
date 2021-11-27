/*Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.*/class Solution {
   
    public int numIdenticalPairs(int[] nums) {
       int sum = 0;
      
      //O(n) solution lines optimised
        int hasharr[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
           sum=sum+hasharr[nums[i]];
            hasharr[nums[i]]++;
        }
      
        //O(n) solution lines not optimsed
        /*int hasharr[] = new int[101];
        for(int i =0;i<nums.length;i++)
        {
            hasharr[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if((hasharr[nums[i]])-1>0) 
              
            { hasharr[nums[i]]--;
            sum=sum+hasharr[nums[i]];}
        }*/
          
        return sum;
    }
}
