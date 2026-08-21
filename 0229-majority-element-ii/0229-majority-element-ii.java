class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num: nums){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }

        for(int num: freqmap.keySet()){
            if(freqmap.get(num)>nums.length/3){
                result.add(num);
            }
        }
        return result;
    }
}