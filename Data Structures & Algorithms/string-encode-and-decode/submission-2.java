class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for (String s : strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        StringBuilder num = new StringBuilder("");
        StringBuilder word = new StringBuilder("");
        List<String> res = new ArrayList<>();
        int i =0;
        while (i <str.length()){
            while (str.charAt(i)!='#'){
                num.append(str.charAt(i));
                i++;
            }
            i++;
            for (int j =0;j<Integer.parseInt(num.toString());j++){
                word.append(str.charAt(i+j));
            }
            i = i + word.toString().length();
            res.add(word.toString());
            num.setLength(0);
            word.setLength(0);
        }
        return res;

    }
}
