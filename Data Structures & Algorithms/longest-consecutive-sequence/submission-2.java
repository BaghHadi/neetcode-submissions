class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seq = new HashSet<>();
        int res = 0;
        for (int e : nums){
            seq.add(e);
        }
        for (int  entry : seq){
            if (!seq.contains(entry - 1)) {
                int count =1;
                int elem = entry;
                while(seq.contains(elem+1)){
                    count++;
                    elem++;
                }
                res = Math.max(res,count);
            }
        }
        return res;

    }
}
