class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;

        for(int min = 0; min < n / 2; min++) {
            int max = n - min - 1;

            for(int i = min; i < max; i++) {
              matrix[min][i] = count++;      
            }

            for(int i = min; i < max; i++) {
              matrix[i][max] = count++;      
            }

            for(int i = max; i > min; i--) {
              matrix[max][i] = count++;
                
            }

            for(int i = max; i > min; i--) {
              matrix[i][min] = count++;
            }
        }

        if(n % 2 == 1) {
            matrix[n / 2][n / 2] = count;
        }

        return matrix;
    }
}