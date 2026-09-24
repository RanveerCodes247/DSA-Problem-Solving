class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
                int freq[] = new int[26];
                for(char c: strs[i].toCharArray()){
                    freq[c-'a']++; //this creates a pattern map
                }
                String key = "";
                for(int f: freq){
                    key=key+f+"#";
            }
        List<String> group = map.get(key);
        if(group==null){
            group = new ArrayList<>();
        }
            group.add(strs[i]);
            map.put(key,group);
        }
    return new ArrayList<>(map.values());
    }
}