//https://leetcode.com/problems/search-insert-position/


class SearchInsert_Position {
    public int searchInsert(int[] n, int target) {
        int first = 0;
        int last = n.length-1;
        while(first <= last){
            int middle  = first + (last - first) / 2;
            if(target < n[middle]){
                last = middle - 1;
            }else if(target > n[middle]){
                first = middle + 1;
        }else{
            return middle;
        }
    }
     return first;
}
}