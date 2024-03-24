class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
         
         ArrayList<Integer> leaders = new ArrayList<>();
       
       int maxFromRight = arr[n - 1];
       
       leaders.add(maxFromRight);
       
       for(int i = n-2 ; i>=0 ; i--){
           if(arr[i] >= maxFromRight){
               leaders.add(arr[i]);
               maxFromRight  = arr[i];
           }
       }
       Collections.reverse(leaders);
       return leaders;
        
        }
}
