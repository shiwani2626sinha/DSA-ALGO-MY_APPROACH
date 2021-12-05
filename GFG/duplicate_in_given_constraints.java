/*Given a sorted array A[] having 10 elements which contain 6 different numbers in which only 1 number is repeated five times. 
Your task is to find the duplicate number using two comparisons only.*/

class Compute {
    
    public int findDuplicate(int A[])
    {
        if(A[3]==A[4])
        return A[3];
        
        if(A[5]==A[6])
        return A[5];
        
        return -1;
    }
    
}
