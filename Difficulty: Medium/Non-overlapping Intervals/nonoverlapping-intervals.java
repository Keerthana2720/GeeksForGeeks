class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int res=0;
        int prev=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int next = intervals[i][0];
            if(prev > next) {
                res++;
            }
            else{
                prev = intervals[i][1];
            }
        }
        return res;
    }
}
