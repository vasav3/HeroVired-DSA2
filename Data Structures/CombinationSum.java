//https://leetcode.com/problems/combination-sum/


class CombinationSum {
    public static void printC(int i,int n , int[] candidates, int target,List<List<Integer>> ans, List<Integer>ds){

        if(i>=n){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                return;
            }
            return;
        }
        
        if(candidates[i] <=target){
            ds.add(candidates[i]);
            printC( i, n,candidates,target-candidates[i],ans,ds);
            ds.remove(ds.size()-1);
        }

        printC( i+1, n,candidates,target,ans,ds);


    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> ans = new ArrayList<>(); 
      int n = candidates.length;
        printC(0,  n, candidates, target,ans, new ArrayList<>());
        return ans;
    }
}