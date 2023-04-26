//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


class FirstSecond_SortedArray{
public int[] searchRange(int[] n, int target) {
    int len = binarySearch(n, target);
    if (len == n.length || n[len] != target) return new int[] { -1, -1 };
    int rotate = binarySearch(n, target + 1);
    return new int[] { len, rotate - 1 };
}
private int binarySearch(int[] n, int target) {
    int len = 0, rotate = n.length;
    while (len < rotate) {
        int m = (len + rotate) / 2;
        if (n[m] < target) len = m + 1;
        else rotate = m ;
    }
    return len;
}
}