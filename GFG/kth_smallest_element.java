/*Given an array arr[] and an integer K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct. */

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //approach1: simple, O(nlogn)
        /*Arrays.sort(arr);
        int n =0;
        int i =0;
        for(;i<arr.length;i++)
        {
            if((i>0 && arr[i]!=arr[i-1]) ||(i==0) )
            n++;
            
            if(n==k)
            break;
        }
        return arr[i];*/
        
        //approach2 : map, ordered -->treemap
        int count=0;
        TreeMap<Integer,Integer>map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
         for(Map.Entry m:map.entrySet()){  
            count = count+(int)m.getValue();
            if(count == k)
            return (int)m.getKey();
         }         
        return -1;
    } 
}
