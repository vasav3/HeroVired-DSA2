// https://leetcode.com/problems/regular-expression-matching/



class ExpressionMatching {
    public boolean isMatch(String s, String p) {
        return s.matches("^" + p + "$");
    }
}