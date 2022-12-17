class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int actualCount = 1;
        int max = 1;
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                actualCount++;
                max = Math.max(max, actualCount);
            } else if (nums[i] == nums[i-1]) {
                continue;
            } else {
                actualCount = 1;
            }
        }
        return max;
    }
}
    
