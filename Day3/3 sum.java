class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> toreturn = new LinkedList<List<Integer>>();
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    HashSet<List<Integer>> check = new HashSet<List<Integer>>();
    for (int i = 0; i < nums.length; i++)   hm.put(nums[i], i);
    for (int i = 0; i < nums.length - 1; i++)
        for (int j = i + 1; j < nums.length; j++)
            if(hm.get(-nums[i]-nums[j]) != null && check.add(Arrays.asList(nums[i], nums[j])) && hm.get(-nums[i]-nums[j]) > j)
                toreturn.add(Arrays.asList(nums[i], nums[j], -nums[i]-nums[j]));
    return toreturn;
  
    }
}
