class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> H1 = new HashMap<>();
        List<String> res = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        for(int i =0;i<strs.length;i++){
            String s = strs[i];
            Map<Character, Integer> H0 = new HashMap<>();
            for (int j =0;j<s.length();j++){
                H0.put(s.charAt(j),H0.getOrDefault(s.charAt(j),0)+1);
            }
            if (H1.containsKey(H0)){
                res = H1.get(H0);
                res.add(s);
                H1.put(H0,res);
            }else{
                H1.put(H0, new ArrayList<>(List.of(s)));
                
            }
        }
        for (List<String> tab : H1.values()){
            result.add(tab);
        }
        return result;
    }
}
