//https://leetcode.com/problems/wildcard-matching/


class Wildcard_Matching {
    public boolean isMatch(String s, String p) {
        int n = p.length();
        int m = s.length();
        
        return f(n - 1, m - 1, p, s);
    }
    
    private boolean f(int i, int j, String p, String s) {
        if (i < 0 && j < 0) return true;
        if (i < 0 && j >= 0) return false;
        if (j < 0 && i >= 0) {
            for (int k = 0; k <= i; k++) {
                if (p.charAt(k) != '*') {
                    return false;
                }
            }
            return true;
        } 
        if (p.charAt(i) == s.charAt(j) || p.charAt(i) == '?') {
            return f(i - 1, j - 1, p, s);
        }
        if (p.charAt(i) == '*') {
            return f (i - 1, j, p, s) || f (i, j - 1, p, s);
        }
        return false;
    }
}