class Solution {
public:
    int singleNumber(vector<int>& nums) {
        for(auto num:nums){
            int cnt=count(nums.begin(),nums.end(),num);
            if(cnt==1){
                return num;
            }
        }
        return -1;
    }
};