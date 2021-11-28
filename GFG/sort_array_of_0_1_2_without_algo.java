//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

class Solution
{
    public static void sort012(int a[], int n)
    {
        int arr[] = new int[3];
        for(int i =0;i<n;i++)
        {
            arr[a[i]]++;
        }
        int i=0,j=0;
        for(;i<=2;i++)
        {
            while(arr[i]!=0)
            {
                a[j]=i;
                arr[i]--;
                j++;
            }
        }

    }
}
