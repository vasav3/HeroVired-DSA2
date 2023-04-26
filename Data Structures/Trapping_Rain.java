//https://leetcode.com/problems/trapping-rain-water/


class Traping_Rain {
    public int trap(int[] arr) {
        int answer=0;

        for(int i=0;i<arr.length;i++){
            int left =0;
            for(int j=0;j<=i;j++){
                left =Math.max(left,arr[j]);
            }
            int right = Integer.MIN_VALUE;
            for(int j=i;j<=arr.length-1;j++){
                right = Math.max(right,arr[j]);
            }
            answer += Math.min(left,right)-arr[i];
        }

        return answer;
    }
}
        
    
