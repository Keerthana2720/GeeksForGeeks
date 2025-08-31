class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int len=arr.length;
        if(len<=1) return 0;
        int left=0, right=len-1;
        int ans=Integer.MIN_VALUE;
        int curr_idx=left;
        while(left<right){
            int base=right-left;
            int height=Math.min(arr[left],arr[right]);
            if(height>arr[curr_idx]){
                continue;
            }
            ans=Math.max(ans, height*base);
            if(arr[left]<=arr[right]){
                left++;
                curr_idx=left;
            }else{
                right--;
                curr_idx=right;
            }
        }
        return ans;
    }
}