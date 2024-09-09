public class NumSpecial {
    public static void main(String[] args) {
        int [][] mat = {{1,0,0}, {0,0,1}, {1,0,0}};
        int [][] mat2 = {{1,0,0}, {0,1,0}, {0,0,1}};
        int [][] mat3 = {{0,0}, {0,0}, {0,1}};
        int [][] mat4 = {{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,1},{0,0,0,0,1,0,0,0},{1,0,0,0,1,0,0,0},{0,0,1,1,0,0,0,0}};
//        System.out.println(numSpecial(mat));
//        System.out.println(numSpecial(mat2));
//        System.out.println(numSpecial(mat3));
        System.out.println(numSpecial(mat4));
    }
    public static int numSpecial(int[][] mat) {
        int result = 0;
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            int rowInd = -1;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && rowInd == -1) {
                    rowInd = j;
                } else if (mat[i][j] == 1 && rowInd > -1) {
                    rowInd = -1;
                    break;
                }
            }
            rows[i] = rowInd;
        }

        for (int j = 0; j < mat[0].length; j++) {
            int colInd = -1;
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][j] == 1 && colInd == -1) {
                    colInd = i;
                } else if (mat[i][j] == 1 && colInd > -1) {
                    colInd = -1;
                    break;
                }
            }
            cols[j] = colInd;
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i] >= 0 && cols[rows[i]] >= 0) {
                result++;
            }
        }

        return result;
    }
}
