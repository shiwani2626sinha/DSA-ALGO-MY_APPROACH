/* complete the function merge that takes arr1, arr2, n and m as input and modifies them in place so that they look like the sorted merged array when concatenated*/
class Solution
{
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i = arr1.length-1;
        int j = 0;
        while( j<arr2.length && i>=0 && arr1[i]>arr2[j]){
            long temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                    i--;
                    j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
