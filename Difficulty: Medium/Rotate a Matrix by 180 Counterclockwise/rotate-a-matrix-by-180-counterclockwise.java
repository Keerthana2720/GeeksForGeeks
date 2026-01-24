class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
     int n=mat.length;
      for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            int[] temp = mat[i];
            mat[i] = mat[n - 1 - i];
            mat[n - 1 - i] = temp;
        }
    }
}