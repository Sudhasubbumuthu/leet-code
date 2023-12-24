//74. Search a 2D Matrix
class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
    int rows = matrix.length;
    if (rows == 0) return false; // Empty matrix case

    int cols = matrix[0].length;
    int low = 0;
    int high = rows * cols - 1;

    while (low <= high) {
        int mid = (low + high) / 2;
        int midElement = matrix[mid / cols][mid % cols];

        if (midElement == target) {
            return true;
        } else if (midElement < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return false;
}
}
