class Solution {
    public int lcm(int a, int b) {
        // code here
        int max = Math.max(a,b);
        while(true){
            if(max % a ==0 && max % b ==0){
                return max;
            }
        
        max++;
    }
}
} 
