link:https://leetcode.com/problems/3sum/submissions/859839309/

import java.util.*;  
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res= new ArrayList<>();
        Arrays.sort(nums);
        int target=0,l,r;
        for(int i=0;i<nums.length;i++)
        {
            l=i+1;
            r=nums.length-1;
            while(l<r)
            {
                if(nums[l]+nums[r]<(-1*nums[i]))
                {
                    l++;
                    r++;
                }
                else if(nums[l]+nums[r]==(-1*nums[i]))
                {
                    List<Integer>sum2= new ArrayList<>(3); 
                    sum2.add(nums[i]);
                    sum2.add(nums[l]);
                    sum2.add(nums[r]);
                    if(!res.contains(sum2))
                        res.add(sum2);
                }
                r--;
            }
        }
    return res;
    }
}