class Solution {
    
    public boolean isValid(int[] arr, int k,long guess){
    
        long pages = 0;
        int numberOfStudent =1;
        
        for(int i =0;i<=arr.length-1;i++){
            if (pages + arr[i] > guess) {
                numberOfStudent++;
                pages = arr[i];
            } else {
                pages += arr[i];
            }
        }
        if(numberOfStudent<=k){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public int findPages(int[] arr, int k) {
        if(k>arr.length){
            return -1;
        }
        long res = -1l;
        
        long low = Arrays.stream(arr).max().getAsInt();
        long high = Arrays.stream(arr)
                          .asLongStream()
                          .sum();
        
        while(low<=high){
            long guess = (long)(low+high)/2;
            
            boolean b = isValid(arr,k,guess);
            if(b){
                res = guess;
                high = guess-1;
            }
            else{
                low = guess+1;
            }
        }
        
        return (int)res;
        
    }
}