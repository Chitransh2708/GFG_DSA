class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int start1 = arr[0][0];
        int end1 = arr[0][1];
        boolean attend = true;
        
        for(int i =1;i<=arr.length-1;i++){
            
            int start2 = arr[i][0];
            int end2 = arr[i][1];
            
            if(end1>start2){
                attend = false;
                break;
            }
            
            start1 = start2;
            end1 = end2;
        }
        
        return attend;
    }
}