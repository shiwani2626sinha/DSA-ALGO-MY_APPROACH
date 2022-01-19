class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length==0 || nums.length==1)
            return 0;
        int start=-1,end=-1,i,j,b=0;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {b=1; break;}
        }
        if(b!=0)
        start = i;
        b=0;
        for(j=nums.length-1;j>0;j--)
        {
            if(nums[j-1]>nums[j])
                {b=1; break;}
        }
        if(b!=0)
        end = j;
        if(start ==-1 && end == -1)
            return 0;
        int min = nums[start];
        for(i =start;i<=end;i++)
        {
            if(nums[i]<min)
                min=nums[i];
        }
        int max = nums[end];
        for(i=end;i>=start;i--)
        {
            if(max<nums[i])
                max=nums[i];
        }
          for(i=0;i<=nums.length-1;i++)
        {
            if(nums[i]>min)
                break;
        }
        start=i;
        for(j=nums.length-1;j>=0;j--)
        {
            if(max>nums[j])
                break;
        }
        end = j;
        return end-start+1;
        
    }
}
