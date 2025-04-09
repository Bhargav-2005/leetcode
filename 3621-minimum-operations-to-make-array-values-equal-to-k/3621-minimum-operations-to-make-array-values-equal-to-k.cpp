class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        unordered_map<int,int> mpp;
        for(int i=0;i<nums.size();i++){
            if(nums[i]<k) return -1;
            mpp[nums[i]]++;
        }
        int count=mpp.size();
        vector<pair<int,int>> vec(mpp.begin(),mpp.end());
        for(int i=0;i<vec.size();i++){
            if(vec[i].first==k) count--;
        }
        return count;
    }
};