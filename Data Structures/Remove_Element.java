//https://leetcode.com/problems/remove-element/

import java.util.*;
class Remove_Element {
    public int removeElement(int[] number, int value) {
        int ind= 0, fastindex = 0, len = number.length;

        while(fastindex<len) {
            if(number[fastindex] == value) {
                fastindex++;
            } else {
                number[ind] = number[fastindex];
                fastindex++;
                ind++;
            }
        }
        return ind;

    }
}