class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
        list.add(entry);
        }

        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-i-1;j++){
                if(list.get(j).getValue()<list.get(j+1).getValue()){
                    Map.Entry<Character,Integer> temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list){
            for(int i=0;i<entry.getValue();i++){
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}