class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int res = -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int guess = (low+high)/2;
            if(arr[guess]==k){
                return guess;
            }
            if(arr[guess]>k){
                res = guess;
                high = guess-1;
            }
            else{
                low = guess+1;
            }
        }
        return res==-1? arr.length:res;
    }
};