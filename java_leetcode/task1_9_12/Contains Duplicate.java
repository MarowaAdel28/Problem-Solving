link:https://leetcode.com/problems/contains-duplicate/
runtime: 20ms
memory: 56.6MB
import java.util.Scanner;
import java.util.*;  
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]-nums[i+1]==0) return true;
        }
        return false;
    }
}

