package first;

public class RotateRight {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        int target = 3;
        System.out.println(new Solution().removeElement(arr, target));
        System.out.println("======");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1, size = nums.length;
        while (left < right) {
            while (left < right) {
                if (nums[left] == val) {
                    break;
                }
                left++;
            }
            while (left < right) {
                if (nums[right] == val) {
                    size--;
                    right--;
                } else {
                    right--;
                    break;
                }
            }
            nums[left] = nums[right];
            size--;
        }
        return size + 1;
    }
}