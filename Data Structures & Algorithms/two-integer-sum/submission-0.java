class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                int j = map.get(complement);
                return i < j ? new int[]{i, j} : new int[]{j, i};
            }
        }
        return new int[]{};
    }
}
