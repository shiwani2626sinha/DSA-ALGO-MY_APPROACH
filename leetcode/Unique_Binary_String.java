class Solution {
    List<String>list = new ArrayList<>();
    public void formString(int index, String res, int n){
        if(index==n)
        {
            list.add(res);
            return;
        }   
        else{
            formString(index+1,res+"0",n);
            formString(index+1,res+"1",n);
        }
    }
    public String findDifferentBinaryString(String[] nums) {
            int n = nums.length;
            String res="";
            formString(0,res,n);
            for(int i = 0;i<nums.length;i++)
            {
                if(list.contains(nums[i]))
                    list.remove(nums[i]);
            }
            return list.get(0);
        
    }
}
