class Solution {
   
    public int [] reverse(int[]arr,int i, int j)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }return arr;
    }
    public void rotate(int[] arr, int k) {
       /*
       time : 64.91%
        int arrCopy[] = new int[arr.length];
        for(int i=0;i <arr.length;i++)
            arrCopy[i] = arr[i];
        for(int index = 0;index<arr.length;index++){
            arr[(index+k)%arr.length] = arrCopy[index];
        }*/
        
        k = k % arr.length;
        arr=reverse(arr,0,arr.length-1);
      
        arr=reverse(arr,0,k-1);
       
        arr=reverse(arr,k,arr.length-1);
        
        
    }
}
