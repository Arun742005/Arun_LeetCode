class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0 , high = m * n-1;

        while(low <= high){
            int mid = low + (high - low) /2;

            int row = mid / m;
            int col = mid % m;
            int midValue = matrix[row][col];

            if(midValue == target){
                return true;
            }else if(midValue < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return false;
    }
}