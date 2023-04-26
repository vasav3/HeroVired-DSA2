//68: Length of Last Word
//solution:
class Lastword{
    public int lengthOfLastWord(String s) {
        int len = 0;
        char[] chars=s.toCharArray();
        for (int i = chars.len - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                len++;
                if (i != 0 && chars[i-1] == ' ') {
                    return len;
                }
            }
        }
        return len;
    }
}