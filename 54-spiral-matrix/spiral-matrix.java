class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       
       int colBeg=0;
       int colEnd=matrix[0].length -1;
       int rowBeg=0;
       int rowEnd=matrix.length-1;
       ArrayList<Integer> result = new ArrayList<>();

       while(colBeg <= colEnd && rowBeg <= rowEnd)
       {
        //travse right
        for(int i=colBeg; i<=colEnd;i++){
            result.add(matrix[rowBeg][i]);
        }
        rowBeg++;

        //traverse down
        for(int i=rowBeg; i<=rowEnd;i++){
             result.add(matrix[i][colEnd]);
        }
            colEnd--;

        //traverse right
        if(rowBeg <= rowEnd){
        for(int i=colEnd; i>=colBeg;i--){
             result.add(matrix[rowEnd][i]);
        }
        rowEnd--;
        }

        //traverse up
        if(colBeg <= colEnd){
        for(int i=rowEnd; i>=rowBeg;i--){
             result.add(matrix[i][colBeg]);
        }
            colBeg++;
        }

       }
       return result;  
    }
}