// User function Template for Java

class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        // code here
        int[][] matrix = new int[n][m];
        int top =0,bottom = n-1;
        int left = 0,right = m-1;
        
        int index=0;
        while(top <= bottom && left <= right){
               for (int i = left; i <= right; i++) {
                matrix[top][i] = arr[index++];
            }
            top++; // Move the top boundary down

            // Fill the right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = arr[index++];
            }
            right--; // Move the right boundary left

            // Fill the bottom row (if there are rows remaining)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = arr[index++];
                }
                bottom--; // Move the bottom boundary up
            }

            // Fill the left column (if there are columns remaining)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = arr[index++];
                }
                left++; // Move the left boundary right
            }
        }

        return matrix;
    }
}

