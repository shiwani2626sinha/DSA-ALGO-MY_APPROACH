/*Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. 
If there are repetitions, then only one occurrence of element should be printed in the union.*/

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i =0;i<a.length;i++){
            
            if(map.get(a[i])!=null)
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
        }
        
        for(int i =0;i<b.length;i++){
            if(map.get(b[i])!=null)
                map.put(b[i],map.get(b[i])+1);
            else
                map.put(b[i],1);
        }
        
        return map.size();
    }
}
