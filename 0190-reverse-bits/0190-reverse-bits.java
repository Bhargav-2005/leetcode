public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        System.out.println(n+" "+Integer.toString(n,2));
        String bin32=String.format("%32s",Integer.toBinaryString(n));
        bin32 = bin32.replace(' ','0');
        String revbin="";
        for(int i=bin32.length()-1;i>=0;i--){
            revbin+=bin32.charAt(i);
        }
        System.out.println(bin32+"\t"+revbin);
        long res=Long.parseUnsignedLong(revbin,2);
        return (int)res;
    }
}