link:https://leetcode.com/problems/two-sum/

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> myHashMap=new Hashtable<Integer,Integer>();  
        for(int i=0;i<nums.length;i++)
        {
            if (!myHashMap.containsKey(nums[i])) 
            {
                myHashMap.put(target-nums[i],i); 
            }
            else {
                int val=myHashMap.get(nums[i]);
                int arr[]={val,i};
                return arr;
            }
        }
        
        return null;
    }
}
Console
