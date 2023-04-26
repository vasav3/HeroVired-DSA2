//https://leetcode.com/problems/multiply-strings/



class Multiply_Strings {
    public static String multiply(String x, String y) {
        return String.valueOf((new java.math.BigInteger(x)).multiply(new java.math.BigInteger(y)));
    }
}