//https://leetcode.com/problems/search-in-rotated-sorted-array/

class Rotated_SortedArray {
    public int search(int[] n, int t) 
    {
        int low=0;
        int high=n.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(n[mid] == t)
                return mid;
            if(n[low]<=n[mid])
            {
                if(t>=n[low] && t<=n[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else
            {
                if(t>=n[mid] && t<=n[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}