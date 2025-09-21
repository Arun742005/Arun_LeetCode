class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n =matrix.length;
        int m = matrix[0].length;

        int row = 0 , col = m-1;
        while(row <n && col >=0){
            int midval = matrix[row][col];

            if(midval == target){
                return true;
            }
            else if(midval > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}