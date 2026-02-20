class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> res = new HashSet<>();
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
          int n = target - arr[i];
          if(res.contains(n)){
              return true;
          }
          res.add(arr[i]);
        }
    
    return false;
}
}
