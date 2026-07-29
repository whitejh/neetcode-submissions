class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memo = new HashMap<>(); // 해시테이블

        for(int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if(memo.containsKey(needed)) {
                return new int[] {memo.get(needed), i};
            }

            memo.put(nums[i],i);
        }

        return new int[] {0,0};
    }
}
