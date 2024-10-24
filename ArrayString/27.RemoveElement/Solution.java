import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: General test
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("New length: " + k1); // Output should be 2
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums1, k1))); // Output should be [2, 2]

        // Test case 2: No elements to remove
        int[] nums2 = {0, 1, 2, 2, 3, 4};
        int val2 = 5;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("New length: " + k2); // Output should be 6
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums2, k2))); // Output should be [0, 1, 2, 2, 3, 4]

        // Test case 3: All elements are the same as `val`
        int[] nums3 = {2, 2, 2, 2};
        int val3 = 2;
        int k3 = solution.removeElement(nums3, val3);
        System.out.println("New length: " + k3); // Output should be 0
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums3, k3))); // Output should be []

        // Test case 4: `val` is not present
        int[] nums4 = {1, 3, 4, 5};
        int val4 = 2;
        int k4 = solution.removeElement(nums4, val4);
        System.out.println("New length: " + k4); // Output should be 4
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums4, k4))); // Output should be [1, 3, 4, 5]
    }
}
