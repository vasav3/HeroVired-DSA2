//https://leetcode.com/problems/generate-parentheses/


class GeneratePare {
    List<String> answer = new ArrayList();
    public List<String> generateParenthesis(int n) {
        find("",n,n);
        return answer;
    }
    private void find(String s, int x, int y) {
        if (x != 0) find(s + "(", x-1, y);
        if (y != 0 && x < y) find(s + ")", x, y-1);
        if (x == 0 && y == 0) answer.add(s);
    }
}