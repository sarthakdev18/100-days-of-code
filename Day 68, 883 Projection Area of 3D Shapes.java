class Solution {
    public int projectionArea(int[][] grid) {
        int area = 0;

        for(int i = 0; i < grid.length; i++) {
            int row = 0;
            int cols = 0;

            for(int j = 0; j < grid.length; j++) {
                row = Math.max(row, grid[i][j]);
                cols = Math.max(cols, grid[j][i]);

                if(grid[i][j] > 0) {
                    area++;
                }
            }

            area += row + cols;
        }

        return area;
    }
}