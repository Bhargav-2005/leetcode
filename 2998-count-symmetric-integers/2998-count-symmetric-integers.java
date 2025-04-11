class Solution {
    public static int sumDigits(String num){
        int n=Integer.parseInt(num);
        if(n<10) return n;
        int sum=0,rem;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for(int i=low;i<=high;i++){
            String num=Integer.toString(i);
            if(num.length()%2!=0)continue;
            int fstSum=sumDigits(num.substring(0,num.length()/2));
            int lstSum=sumDigits(num.substring(num.length()/2));
            if(fstSum==lstSum) {
                // System.out.println(i+"\t"+fstSum+"\t"+lstSum+"\t"+num.substring(0,num.length()/2)+"\t"+num.substring(num.length()/2));
                cnt++;
            }
        }
        return cnt;
    }
}