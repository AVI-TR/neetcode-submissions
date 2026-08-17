class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> groups = new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int value:count){
                key.append('#').append(value);
            }
            groups.putIfAbsent(key.toString(),new ArrayList<>());
            groups.get(key.toString()).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
