link:https://leetcode.com/problems/two-sum/

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target) 
                {
                    int[] sol={i,j};
                    return sol;
                }
            }
        }
        return null;
    }
}