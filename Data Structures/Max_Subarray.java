//63: Maximum Subarray
//solution:
class Max_Subarray {
    public int maxSubArray(int[] n) {
        int sum = 0 , maximum = Integer.MIN_VALUE;;
        int i = 0 , j = 0;
        while(j<n.length){
           
            if(sum < 0 && n[j] >= sum){
                sum = 0;
                i = j;
            }
             sum += n[j];
            maximum = Math.max(maximum , sum);
            j++;
        }
        return maximum;
    }
}