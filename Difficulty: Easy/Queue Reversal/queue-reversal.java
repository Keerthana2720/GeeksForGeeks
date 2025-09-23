class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        int[] res = new int[q.size()];
        for(int i=q.size()-1;i>=0;i--){
            res[i] = q.poll();
        }
        q.clear();
        
        for(int num : res){
            q.add(num);
        }
        
    }
}