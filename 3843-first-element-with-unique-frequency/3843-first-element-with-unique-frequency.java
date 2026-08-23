class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> freqmap = new HashMap<>();

        for(int num: nums){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }

        HashMap<Integer, Integer> freqCount = new HashMap<>();

        for(int num: freqmap.values()){
            freqCount.put(num,freqCount.getOrDefault(num,0)+1);
        }

        for(int num : nums){
    
        int frequency = freqmap.get(num);

        if(freqCount.get(frequency) == 1){
        return num;
    }
}

return -1;

    }
}