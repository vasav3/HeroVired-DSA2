//56: Permutations
//solution:
class Permutaionss {
    static void swap(int[]n,int i,int j){
        int temp=n[i];
        n[i]=n[j];
        n[j]=temp;
    }
    static void solve(int[] n,int idx,List<List<Integer>> ans){
        if(idx==n.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n.length;i++){
                temp.add(n[i]);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<n.length;i++){
            swap(n,idx,i);
            solve(n,idx+1,ans);
            swap(n,idx,i);
        }
        return;

    }
    public List<List<Integer>> permute(int[] n) {
        List<List<Integer>> ans =new ArrayList<>();
        solve(n,0,ans);
        return ans;
    }
}