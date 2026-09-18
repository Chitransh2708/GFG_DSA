class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int res = -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int guess=(low+high)/2;
            if(arr[guess]>arr[arr.length-1]){
                res = guess;
                low = guess+1;
            }
            else{
                high = guess-1;
            }
        }
        return res+1;
    }
}