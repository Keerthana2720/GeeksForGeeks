class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int cs =0;
        int m = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            m =Math.max(m,cs);
        if(cs < 0){
            cs =0;
        }
        }
    return m;
}
}

