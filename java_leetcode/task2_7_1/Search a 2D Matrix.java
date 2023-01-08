//Search a 2D Matrix
//https://leetcode.com/problems/search-a-2d-matrix/description/
//medium
//0 ms
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearchMatrix(matrix,0,matrix.length-1,0,matrix[0].length-1,target);
    }
    public boolean binarySearchMatrix(int[][] matrix,int startRow,int endRow, int startCol,int endCol,int target) {
        int midRow=(startRow+endRow)/2;
        int midCol=(startCol+endCol)/2;
        if((startRow>endRow)) return false;
        if (target==matrix[midRow][midCol]) return true;
        else if(target>=matrix[midRow][0] && target<=matrix[midRow][matrix[0].length-1]) { //same row
            while(startCol<=endCol) {
                midCol=(startCol+endCol)/2;
                if (target==matrix[midRow][midCol]) return true;
                else if (target < matrix[midRow][midCol]) endCol=midCol-1;
                else startCol=midCol+1;
            }
            return false;
        } 
        else if(target<matrix[midRow][0]) return binarySearchMatrix(matrix,startRow,midRow-1,startCol,endCol,target);
        else return binarySearchMatrix(matrix,midRow+1,endRow,startCol,endCol,target);
        
    }
}

