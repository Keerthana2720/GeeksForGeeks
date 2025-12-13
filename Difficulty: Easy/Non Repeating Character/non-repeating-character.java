class Solution {
    public char nonRepeatingChar(String s) {
       int max_char = 26;
       int[] freq = new int[max_char];
       
       for(char c: s.toCharArray()){
           int index = c - 'a';
           freq[index]++;
       }
       for(char c : s.toCharArray()){
           int index = c - 'a';
           if(freq[index] ==1) return c;
       }
       return '$';
       
    }
}