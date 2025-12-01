class Solution {
    public int findSubString(String str) {
        // code here
        int left = 0,min = str.length(),right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for ( char ch : str.toCharArray() ) {
            map.put(ch, 0);
        }
        while (right < str.length()) {
            map.put(str.charAt(right),  map.getOrDefault(str.charAt(right), 0) + 1);

            while(map.get(str.charAt(left)) > 1) {
                map.put(str.charAt(left), map.get(str.charAt(left++)) - 1);
            }
            if(allAvailable(map)) min = Math.min(min, right - left + 1);

            right++;
        }
        return min;
    }
    boolean allAvailable(HashMap<Character, Integer> map) {
        for ( int num : map.values() ) {
            if(num < 1) return false;
        }
        return true;
    }
}

