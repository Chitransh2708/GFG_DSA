class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        
        Arrays.sort(start);
        Arrays.sort(end);
        int room =0;
        int bestMin = Integer.MAX_VALUE;
        int bestMax = Integer.MIN_VALUE;
        int left=0, right =0;
        
        while(left<=start.length-1){
            
            if(start[left]<end[right]){
                room++;
                left++;
                bestMax = Math.max(bestMax,room);
            }
            else if(end[right]<=start[left]){
                bestMin = Math.min(bestMin, room);
                room--;
                right++;
                
                
            }
        }
        
        return bestMax;
        
    }
}
