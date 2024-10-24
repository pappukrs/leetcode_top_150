import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last index of actual elements in nums1
        int j = n - 1; // Last index of nums2
        int k = m + n - 1; // Last index of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If any elements remain in nums2, they should be placed in nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: General test
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3; // number of actual elements in nums1
        int n = 3; // number of elements in nums2

        solution.merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1)); // Output should be [1, 2, 2, 3, 5, 6]

        // Test case 2: nums1 is initially empty
        int[] nums1_2 = {0};
        int[] nums2_2 = {1};
        solution.merge(nums1_2, 0, nums2_2, 1);
        System.out.println("Merged array: " + Arrays.toString(nums1_2)); // Output should be [1]

        // Test case 3: nums2 is empty
        int[] nums1_3 = {1};
        int[] nums2_3 = {};
        solution.merge(nums1_3, 1, nums2_3, 0);
        System.out.println("Merged array: " + Arrays.toString(nums1_3)); // Output should be [1]

        // Test case 4: nums1 and nums2 have only one element each
        int[] nums1_4 = {2, 0};
        int[] nums2_4 = {1};
        solution.merge(nums1_4, 1, nums2_4, 1);
        System.out.println("Merged array: " + Arrays.toString(nums1_4)); // Output should be [1, 2]
    }
}
