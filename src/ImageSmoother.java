public class ImageSmoother {
    public static void main(String[] args) {
        int[][] img = new int[][]{{1,1,1}, {1,0,1}, {1,1,1}};
        System.out.println(imageSmoother(img));
    }

    public static int[][] imageSmoother(int[][] img) {
        int[][] rez = new int[img.length][img[0].length];

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int up = 0, down = 0, left = 0, right = 0;
                if (i - 1 >= 0) {
                    up = i - 1;
                } else {
                    up = i;
                }
                if (i + 1 < img.length) {
                    down = i + 1;
                } else {
                    down = i;
                }

                if (j - 1 >= 0) {
                    left = j - 1;
                } else {
                    left = j;
                }

                if (j + 1 < img[0].length) {
                    right = j + 1;
                } else {
                    right = j;
                }

                for (int m = up; m <= down; m++) {
                    for (int n = left; n <= right; n++) {
                        rez[i][j] += img[m][n];
                    }
                }

                rez[i][j] /= (right - left + 1) * (down - up + 1);
            }
        }

        return rez;
    }
}
