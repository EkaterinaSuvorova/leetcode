public class OnesMinusZeros {
    public static void main(String[] args) {
        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
        int[][] grid2 = {{1,1,1},{1,1,1}};
        System.out.println(onesMinusZeros(grid));
        //System.out.println(onesMinusZeros(grid2));
    }
    public static int[][] onesMinusZeros(int[][] grid) {
        int[] rows = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    rows[i]++;
                } else {
                    rows[i]--;
                }
            }
        }

        for (int j = 0; j < grid[0].length; j++) {
            int col = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1) {
                    col++;
                } else {
                    col--;
                }
            }
            for (int i = 0; i < grid.length; i++) {
                grid[i][j] = col + rows[i];
            }

        }

        return grid;
    }

}
