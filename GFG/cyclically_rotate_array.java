/*Given an array, rotate the array by one position in clock-wise direction.*/
class Compute {
    
    public void rotate(int arr[], int n)
    {
        int key = arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0]= key;
    }
}
