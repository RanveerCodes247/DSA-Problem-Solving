
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        int i = 0;
        int n = nums.length;

        ArrayList<Integer> result = new ArrayList<>();

        while (i < n && count <= n) {
            if (nums[i] == count) {
                count++;
                i++;
            }
            else if (nums[i] < count) {
                i++;
            }
            else {
                result.add(count);
                count++;
            }
        }

        while (count <= n) {
            result.add(count);
            count++;
        }

        return result;
    }
}
