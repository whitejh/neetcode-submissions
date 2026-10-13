class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        boolean[] visited = new boolean[n + 1];
        backtrack(n, new ArrayList<>(), visited, ans, nums);
        return ans;
    }

    void backtrack(int n, List<Integer> cur, boolean[] visited, List<List<Integer>> ans, int[] nums) {
        if(cur.size() == n) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                cur.add(nums[i]);
                visited[i] = true;
                backtrack(n, cur, visited, ans, nums);
                cur.remove(cur.size() - 1);
                visited[i] = false;
            }
        }
    }
}
