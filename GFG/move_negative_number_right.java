/* Given an unsorted array arr[] of size N having both negative and positive integers.
The task is place all negative element at the end of array without changing the order of positive element and negative element. */

class Solution {
    
  /* very easy approach, use of aux array, time - o(n)
    public int[] segregateElements(int arr[], int n)
    {
      
       
        int result[] = new int[n];
        int j =0;
        for(int i = 0; i<n;i++){
            if(arr[i]>0)
            {result[j] = arr[i];
            j++;}
        }
        for(int i = 0; i<n;i++){
            if(arr[i]<0)
            {result[j] = arr[i];
            j++;}
        }
      
      return result;
    }
}*/
  
  // shift but unoptimised approach
  class Solution {
    
    public int[] shiftArray(int arr[], int firstNeg, int delEle){
        for(int i = delEle; i>firstNeg; i--)
        {
            arr[i] = arr[i-1];
        }
        return arr;
    }
    
    public void segregateElements(int arr[], int n)
    {
        int firstNeg = -1;
        for(int i =0;i<arr.length;i++){
            
            if(firstNeg == -1 && arr[i]<0)
            firstNeg = i;
            
            if(firstNeg >=0 && arr[i]>=0)
            
            {
                
                int key= arr[i];
                arr= shiftArray(arr, firstNeg, i);
                arr[firstNeg] = key;
                firstNeg++;
            }
        }
