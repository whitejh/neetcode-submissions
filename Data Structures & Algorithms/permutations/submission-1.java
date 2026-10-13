class Solution {
    int[] nums;
    boolean[] visited;
    List<List<Integer>> ans;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        ans = new ArrayList<>();
        int n = nums.length;
        visited = new boolean[n + 1];
        
        backtrack(new ArrayList<>());
        return ans;
    }

    void backtrack(List<Integer> cur) {
        if(cur.size() == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                cur.add(nums[i]);
                visited[i] = true;
                backtrack(cur);
                cur.remove(cur.size() - 1);
                visited[i] = false;
            }
        }
    }
}
