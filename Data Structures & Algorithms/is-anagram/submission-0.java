class Solution {
    public boolean isAnagram(String s, String t) {
        int l = s.length();
        Map<Character, Integer> map = new HashMap<>(l);
        if (l != t.length()) return false;
        int i = 0, j = 0;
        
        while ( i < l) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            i++;
        }
        while ( j < l){
            map.put(t.charAt(j), map.getOrDefault(t.charAt(j), 0) - 1);
            j++;
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value != 0){
                return false;
            }
        }
        return true;
    }
}
