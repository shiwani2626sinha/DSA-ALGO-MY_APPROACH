//https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for(int i =0;i<nums.length-1;i++) {
            int j = Arrays.binarySearch(nums,target-nums[i]);
            if(j>0){
                if(i!=j){
                    res[0]=i;
                    res[1]=j
                }
                else{
                    res[0] = i;
                    res[1] =
                }
            }
        }
        return res;
    }
}
