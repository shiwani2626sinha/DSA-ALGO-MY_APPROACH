//priority queue approach
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int [] pq = new int[nums.length];
        int cnt = -1;
        for(int i=0;i<nums.length;i++){
            if(cnt==-1) {
                cnt++;
                pq[cnt]=nums[i];
            }  
            else{
                int temp=cnt;
                cnt++;
                while(temp>=0 && pq[temp]<nums[i]){
                    pq[temp+1]=pq[temp];
                    temp--;
                }
                pq[temp+1] = nums[i];
            }
        }
        
        return pq[k-1];
    }
}
