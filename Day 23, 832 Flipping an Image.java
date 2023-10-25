class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int img = image.length;

        for(int i = 0; i < img; i++) {
            for(int j = 0; j < (img + 1) / 2; j++) {
                int a = image[i][j];
                image[i][j] = image[i][img - j - 1] ^ 1;
                image[i][img - j - 1] = a ^ 1;
            }
        }

        return image;
    }
}