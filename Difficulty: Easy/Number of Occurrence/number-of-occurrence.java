class Solution {
    public int firstOccurence(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int res = -1;
        while(low<=high){
            int guess = (low+high)/2;
            if(arr[guess] < target){
                low = guess+1;
            }
            else if(arr[guess] > target){
                high = guess-1;
            }
            else{
                res = guess;
                high = guess-1;
            }
            
        }
        
        return res;
        
    }
    public int lastOccurence(int[] arr, int target){
         int low = 0;
        int high = arr.length-1;
        int res=-1;
        while(low<=high){
            int guess = (low+high)/2;
            if(arr[guess] < target){
                low = guess+1;
            }
            else if(arr[guess] > target){
                high = guess-1;
            }
            else{
                res = guess;
                low = guess+1;
            }
            
        }
        return res;
        
    }
    int countFreq(int[] arr, int target) {
        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);
        if(last == -1 && first == -1){
            return 0;
        }
        
        
        return last-first+1;
        
    }
}
