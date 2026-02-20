import java.util.HashMap;

class Solution {
    int countPairs(int arr[], int target) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }

            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}