class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int imageSize = image.length;
        int[][] result = new int[imageSize][imageSize];
        int rowCount = 0;
        for(int[] row: image){
            int pixelCount = 0;
            for(int i = row.length-1; i >=0; i--){
                result[rowCount][pixelCount] = 1 - row[i];
                pixelCount++;
            }
            rowCount++;
        }
        return result;
    }
}