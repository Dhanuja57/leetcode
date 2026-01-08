class Solution {
    int[] parent;
    int count;

    public int numIslands(char[][] grid) {
        int r = grid.length, c = grid[0].length;
        parent = new int[r * c];
        count = 0;

        // initialize
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    int id = i * c + j;
                    parent[id] = id;
                    count++; // each '1' is initially an island
                }
            }
        }

        int[][] dirs = {{1,0},{0,1}};

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    for (int[] d : dirs) {
                        int ni = i + d[0], nj = j + d[1];
                        if (ni < r && nj < c && grid[ni][nj] == '1') {
                            union(i * c + j, ni * c + nj);
                        }
                    }
                }
            }
        }
        return count;
    }

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]); // path compression
        return parent[x];
    }

    void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px != py) {
            parent[py] = px;
            count--; // two islands merged into one
        }
    }
}
