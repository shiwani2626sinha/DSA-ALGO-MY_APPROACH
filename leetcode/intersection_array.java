/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>arr = new ArrayList<Integer>();
        Arrays.sort(nums1);
        for(int i=0;i<nums2.length;i++)
        {
            if(Arrays.binarySearch(nums1, nums2[i])>=0 && !arr.contains(nums2[i]))
                arr.add(nums2[i]);
        }
        
        int[] res = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]= arr.get(i);
        }
        return res;
    }
}
