//200. Number of Islands
class Solution {
    static class pair{
        int f,s;
        public pair(int i, int j){
            this.f = i;
            this.s = j;
        }
    }
    public boolean issafe(char[][] grid, boolean[][] vis, int i, int j, int R, int C){
        return i>=0 && i<R && j>=0 && j<C && grid[i][j] == '1' && !vis[i][j];
    }
    public void bfs(char[][] grid, boolean[][] vis, int si, int sj,int R, int C){
        int[] row = {-1,0,0,1};
        int[] col = {0,-1,1,0};
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(si, sj));
        vis[si][sj] = true;
        while(!q.isEmpty()){
            int i = q.peek().f;
            int j = q.peek().s;
            q.remove();
            for(int k=0; k<4; k++){
                if(issafe(grid, vis, i+row[k], j+col[k], R, C)){
                    vis[i+row[k]][j+col[k]] = true;
                    q.add(new pair(i+row[k],j+col[k]));
                }
            } 
        }
    }

    public int numIslands(char[][] grid) {
        int res = 0,R = grid.length, C = grid[0].length;
        boolean[][] vis = new boolean[R][C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    bfs(grid,vis,i,j,R,C);
                    res++;
                }
            }
        }
        return res;
    }
}
