//https://leetcode.com/problems/longest-valid-parentheses/


class Longestvalid_Parentheses {
    public int longestValidParentheses(String str) {
        
        Stack<Integer> stack = new Stack<>();
        char[] array = str.toCharArray();
        
        int count =0;
        int result=0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]=='('){
                stack.push(i);
            }
            else if(array[i]==')' && stack.size()>0){
                stack.pop();
            }
            else if(array[i]==')' && stack.size()==0){
                array[i]='.';
            }
        }
        
        while(stack.size()>0){
            array[stack.pop()]= '.';
        }
        
        for(int i=0; i<array.length; i++){
            if(array[i]=='(' || array[i]==')'){
                count++;
            }
            else{
                result = Math.max(result, count);
                count=0;
            }
        }
        return Math.max(result,count);
    }
}