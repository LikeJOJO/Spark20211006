package third;

import java.util.List;

public class LoveU {
    public static void main(String[] args) {

    }
}
//
//class Solution {
//    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
//
//    }
//}

//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if (matrix.length == 0) return false;
//        int rowIndex = 0;
//        for (rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
//            if (matrix[rowIndex][0] >= target) break;
//        }
//        if (matrix[rowIndex][0] == target) return true;
//        for (int i = 0; i < matrix[rowIndex - 1].length; i++) {
//            if (matrix[rowIndex - 1][i] == target) return true;
//        }
//        return false;
//    }
//}

//class Solution {
//    public int search(int[] nums, int target) {
//        if (nums.length == 0) return -1;
//        if (target > nums[0]) {
//            //从左向右找
//            for (int i = 0;i<nums.length;i++) {
//                if (target == nums[i]) {
//                    return i;
//                }
//            }
//        } else if (target < nums[0]) {
//            //从右向左找
//            for (int i = nums.length - 1;i>=0;i--) {
//                if (target == nums[i]) {
//                    return i;
//                }
//            }
//        } else {
//            return 0;
//        }
//        return -1;
//    }
//}
