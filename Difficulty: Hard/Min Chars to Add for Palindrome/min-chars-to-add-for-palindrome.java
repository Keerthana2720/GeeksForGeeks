class Solution {
    public int minChar(String s) {
        int n = s.length();
        
        // Reverse the string
        String rev = new StringBuilder(s).reverse().toString();
        
        // Combine string with a separator
        String temp = s + "#" + rev;
        
        // Build LPS array
        int[] lps = new int[temp.length()];
        
        int len = 0;
        int i = 1;
        
        while (i < temp.length()) {
            if (temp.charAt(i) == temp.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        // Minimum characters to add
        return n - lps[temp.length() - 1];
    }
}
