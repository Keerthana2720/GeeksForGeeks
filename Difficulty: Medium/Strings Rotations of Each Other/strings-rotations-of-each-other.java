class Solution {
    public boolean areRotations(String s1, String s2) {
        // Length must be same
        if (s1.length() != s2.length()) {
            return false;
        }

        // Concatenate s1 with itself
        String text = s1 + s1;

        // Check if s2 is substring of text using KMP
        return KMPSearch(text, s2);
    }

    // KMP Search
    private boolean KMPSearch(String text, String pattern) {
        int[] lps = computeLPS(pattern);
        int i = 0; // index for text
        int j = 0; // index for pattern

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                return true; // match found
            } 
            else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    // Compute LPS array
    private int[] computeLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
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
        return lps;
    }
}
