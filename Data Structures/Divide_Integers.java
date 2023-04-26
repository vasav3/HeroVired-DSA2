//https://leetcode.com/problems/divide-two-integers/


class Divide_Integers {
    public int divide(int x, int y) {
        int a;
        if(x==y){
            return 1;
        }
        if(x==Integer.MIN_VALUE && y==-1){
            a= Integer.MAX_VALUE;
            return a;
        }

        a=x/y;
        return a;
        
        
    }
}