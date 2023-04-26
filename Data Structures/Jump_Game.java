//55: Jump Game II
//solution:
class Jump_Game {
    public int jump(int[] n) {
        int j = 0;

        int left = 0;
        int right = 0;
        while(right < n.length - 1) {
            int farthestJump = 0;

            for(int i = left; i < right + 1; i++) {
                farthestJump = Math.max(farthestJump, i + n[i]);
            }

            left = right + 1;
            right = farthestJump;

            j += 1;
        }
        return j;
    }
}