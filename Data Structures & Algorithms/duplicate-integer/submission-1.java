class Solution {
    public boolean hasDuplicate(int[] nums) {
        Boolean b = false;
        Integer i = 0;
        Integer v;
        Set<Integer> seen = new HashSet<>();
        while (b == false && i<nums.length) {
            v = nums[i];
            b =  (seen.contains(v));
            seen.add(v);
            i++;
        }
        return b;
    }
}