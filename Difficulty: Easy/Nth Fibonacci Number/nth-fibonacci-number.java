// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        int n1 = 0;
        int n2 = 1;
        for(int i = 0; i<n;i++){
            int temp = n1;
            n1 =  n2;
            n2 = temp + n2 ;
        }
        
        return n1;
    }
}
