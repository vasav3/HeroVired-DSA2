//72: Unique Paths
//solution:
class Unique_Paths1 {
    int[][] grid=null;
    public int uniquePaths(int m, int n) {
        int[][] array=new int[m][n];
        this.grid=new int[m][n];
         for(int[] ar : grid) Arrays.fill(ar,-1);
         int number=getPaths(array,m-1,n-1);
         return number;
    }
    public int getPaths(int[][] array,int i,int j){
       if(i==0 && j==0) return 1;
       if(i<0 || j<0) return 0;
       if(grid[i][j]!=-1) return grid[i][j];
       int dm=getPaths(array,i-1,j);
       int rm=getPaths(array,i,j-1);
       grid[i][j]=(dm+rm);
       return dm+rm;
    }

}