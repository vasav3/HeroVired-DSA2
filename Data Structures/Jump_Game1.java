65: Jump Game

solution:
class Jump_Game1 {
    public boolean canJump(int[] n) {
     int b = 0;
     for(int i =0;i<=b;i++){
         b = Math.max(b,i+n[i]);
         if(b >=n.length-1)
         return true;
     } 
     return false;
    }
}