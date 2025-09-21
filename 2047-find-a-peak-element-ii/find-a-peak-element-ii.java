class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int left =0 , right = col-1;

        while(left <= right){
            int maxcol = (left+right) /2;
            
            int maxrow =0;
            for(int r=0 ; r<row ; r++){
                if(mat[r][maxcol] > mat[maxrow][maxcol]){
                    maxrow =r;
                }
            }

            int leftval = (maxcol-1 >= 0) ? 
                mat[maxrow][maxcol-1] : Integer.MIN_VALUE;
            int rightval = (maxcol+1 < col) ? 
                mat[maxrow][maxcol+1] : Integer.MIN_VALUE;

            if(mat[maxrow][maxcol] > leftval && mat[maxrow][maxcol] > rightval){
                return new int[]{maxrow,maxcol};
            }
            else if(mat[maxrow][maxcol] < leftval){
                right = maxcol -1;
            }
            else{
                left = maxcol +1;
            }
        }
        return new int[]{-1,-1};
    }
}