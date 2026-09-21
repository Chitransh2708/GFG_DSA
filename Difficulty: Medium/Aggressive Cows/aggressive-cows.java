class Solution {
	
	public boolean isValid(int[] arr, int guess, int k) {
		
		int cow = 1;
		int prev = arr[0];
		
		for (int i = 1; i <= arr.length - 1; i++) {
			
			int dist = arr[i]-prev;
			if (dist<guess) {
				continue;
			}
			cow++;
			prev = arr[i];
			
		}
		if (cow >= k) {
			return true;
			
		}
		return false;
	}
	public int aggressiveCows(int[] arr, int k) {
		Arrays.sort(arr);
		int low = 1;
		int high = arr[arr.length - 1] - arr[0];
		int res = -1;
		
		while (low <= high) {
			
			int guess = (low + high)/2;
			
			boolean b = isValid(arr, guess, k);
			if(b){
			    res = guess;
			    low = guess+1;
			}
			else{
			    high  = guess-1;
			}
		}
		return res;
	}
}
