import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        // String a1=Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
        // System.out.println(a1);
        // return a1;
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }
}