// Last updated: 7/10/2026, 11:54:51 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        int index = 0;

        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }

        return ans;
    }
}