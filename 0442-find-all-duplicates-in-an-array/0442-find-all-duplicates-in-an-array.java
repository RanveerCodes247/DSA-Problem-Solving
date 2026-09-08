class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()>1){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}