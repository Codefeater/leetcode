class Solution {
public:
    int check(int x,int y,vector<vector<char>>& grid,int r, int n, int m){
        if(x >= 0 && x < n && y>=0 && y < m && grid[x][y] == '1'){
            qx[r] = x;
            qy[r] = y;
            grid[x][y] = '0';
            ++r;
        }
        return r;
    }
    void floodfill(int x,int y,vector<vector<char>>& grid, int n, int m){
        int h = 0;
        int r = 1;
        qx[0] = x;
        qy[0] = y;
        grid[x][y] = '0';
        while(h < r){
            r = check(qx[h] - 1,qy[h], grid, r, n, m); 
            r = check(qx[h],qy[h] - 1, grid, r, n, m);
            r = check(qx[h] + 1,qy[h], grid, r, n, m); 
            r = check(qx[h],qy[h] + 1, grid, r, n, m);
            ++h;
        }
    }
    int numIslands(vector<vector<char>>& grid) {
        if(grid.size() == 0 || grid[0].size() ==0){
            return 0;
        }
        int n = grid.size();
        int m = grid[0].size();
        int ans = 0;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                if(grid[i][j] == '1'){
                    floodfill(i, j, grid, n, m);
                    ans++;
                }
            }
        }
        return ans;
    }
private:
    int *qx = new int[10000];
    int *qy = new int[10000];
};



深度优先：伪代码
void DFS(int v)
  visited[v] = true
  for (v的每一个邻接点w)
    if (!visited[w]) //如果没有被访问过
      DFS(w)
      
      
广度优先：伪代码
void BFS(int x)
  visited[x] = true
  Queue.push(x)
  While (!Q.empty())
    v = Queue.pop()
    for (v的每个邻接点w)
      if (!visited[w])
          visited[w] = true
          Queue.push(w)
