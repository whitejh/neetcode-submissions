class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, ans);
        return ans;
    }

    private void backtrack(List<Integer> curr, int[] nums, List<List<Integer>> ans) {
        if(curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr)); // 복사본 저장
            return;
        }

        for(int num : nums) {
            if(!curr.contains(num)) {
                curr.add(num);
                backtrack(curr, nums, ans);
                curr.remove(curr.size() - 1); // 백트래킹
            }
        }
    }

}