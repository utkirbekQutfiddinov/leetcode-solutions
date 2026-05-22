class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, rowC=matrix.length, colC=matrix[0].length, right=rowC*colC-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid/colC][mid%colC] == target) return true;
            else if (matrix[mid/colC][mid%colC]  < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}