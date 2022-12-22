class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            Integer integer = numToIndex.get(diff);
            if(integer != null) {
                return new int[] {integer, i};
            }

            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException("Incorrect array");
    }
}   
