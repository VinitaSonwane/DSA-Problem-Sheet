class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }
        sum = max+min;
        return sum;
    }
}
