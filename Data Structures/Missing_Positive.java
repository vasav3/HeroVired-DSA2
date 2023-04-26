//https://leetcode.com/problems/first-missing-positive/



class Missing_Positive {
    public int firstMissingPositive(int[] nums) {
       boolean b[] = new boolean[nums.length+2];
       for(int i=0; i<nums.length; i++){
           if(nums[i] > 0 && nums[i] <= nums.length){
               b[nums[i]] = true;
           }
       }
       System.gc();
       for(int i=1; i<b.length; i++){
           if(!b[i]){
               return i;
           }
       }
       return 0;
    }
}