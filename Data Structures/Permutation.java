//https://leetcode.com/problems/next-permutation/


class Permutation {
    public void rev(int[] number,int i,int j){
        while(i<j){
            int a=number[i];
            number[i]=number[j];
            number[j]=a;
            j--;
            i++;
        }
    }
    public void nextPermutation(int[] number) {
        int n=number.length;
        int index1=0,index2=0;
        int q=0;
        for(int i=n-2;i>=0;i--){
            if(number[i]<number[i+1]){
                index1=i;
                q=1;
                break;
            }
        }
        if(q==1){
            for(int i=n-1;i>=0;i--){
                if(number[i]>number[index1]){
                    index2=i;
                    break;
                }
            }
            int a=number[index1];
            number[index1]=number[index2];
            number[index2]=a;
            rev(number,index1+1,n-1);
        }
        
        if(q==0){
            rev(number,0,n-1);
        }
    }
}