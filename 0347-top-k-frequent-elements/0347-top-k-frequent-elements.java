class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqmap = new HashMap<>();

        for(int num: nums){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(freqmap.keySet());
        list.sort((a, b) -> freqmap.get(b) -freqmap.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}