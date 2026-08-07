class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq  = new List[nums.length+1];
        for (int i =0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        for (int num : nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entity : count.entrySet()){
            freq[entity.getValue()].add(entity.getKey());
        }
        int [] res = new int[k];
        int index =0;
        for (int i = freq.length-1;i>0;i--){
            for (int e : freq[i]){
                res[index++] = e;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
