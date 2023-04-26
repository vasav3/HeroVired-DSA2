//58: Rotate Image
//solution:
class Rotate_Image {
    public void rotate(int[][] mat) {
        
        
       int x = mat.length;
        int y = mat[0].length;
        
        for(int i=1;i<x;i++){
            for(int j=0;j<i;j++){
                
                mat[i][j]=mat[i][j]-mat[j][i];
                mat[j][i]=mat[i][j]+mat[j][i];
                mat[i][j]= mat[j][i]-mat[i][j];
            }
        }
        
        for(int i=0;i<x;i++){
            for(int j=0;j<y/2;j++){
                
                mat[i][j]=mat[i][j]-mat[i][y-j-1];
                mat[i][y-j-1]=mat[i][j]+mat[i][y-j-1];
                mat[i][j]= mat[i][y-j-1]-mat[i][j];
            }
                    
        
    }
    }
}