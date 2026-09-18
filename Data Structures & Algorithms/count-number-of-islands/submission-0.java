class Solution {

    static boolean visited[][];

    public int numIslands(char[][] grid) {
        int islands = 0;
        int rowLen = grid.length;
        int colLen = grid[0].length;
        visited = new boolean[rowLen][colLen];

        for(int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if(grid[i][j] == '1' && visited[i][j] == false) {
                    dfs(i,j,grid);
                    islands++;
                }
            }
        }
        return islands; // dfs 결과로 나온 섬의 총 개수
    }

    public void dfs(int r, int c, char[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
        visited[r][c] = true;

        for(int[] d : dir) {
            int nextRow = r + d[0];
            int nextCol = c + d[1];

            if((nextRow >= 0 && nextRow < rowLen) && (nextCol >= 0 && nextCol < colLen)) {
                if(grid[nextRow][nextCol] == '1' && visited[nextRow][nextCol] == false) {
                    dfs(nextRow,nextCol,grid);
                }
            }
        }

    }
}
