//https://leetcode.com/problems/remove-duplicates-from-sorted-array/


class Remove_Duplicate{
    public int removeDuplicates(int[] number) {
        int ind = 1;
        int x = 1;
        for (int i = 0; i < number.length - 1; i++) {
            int first = number[i];
            int second = number[i + 1];
            if (first != second) {
                number[ind] = second; 
                ind++;
                x++;
            }
        }
        return x;
    }
}
