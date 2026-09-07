class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        
        ArrayList<Integer> l = new ArrayList<>();
        for(int i =0;i<=arr.length-1;i++){
            l.add(-1);
        }
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<=arr.length-1;i++){
            
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                l.set(st.pop(), arr[i]);
            }
            st.push(i);
        }
        
        return l;
        
        
    }
}