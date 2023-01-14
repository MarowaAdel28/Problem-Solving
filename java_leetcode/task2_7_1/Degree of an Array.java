// Degree of an Array
// link: https://leetcode.com/problems/degree-of-an-array/description/
// easy
// 72 ms
class Solution {
    int [] freqArr=new int[50_000];
    public int findShortestSubArray(int[] nums) {
        List <Integer> list = new ArrayList<>();
        int maxFreq=0,max=-1; 
        for(Integer x:nums) {
            freqArr[x]++;
            if(freqArr[x]>maxFreq) {
                maxFreq=freqArr[x];
                max=x;
            }
        }
        for(int i=0;i<freqArr.length;i++) {
            if (freqArr[i]==freqArr[max] ) list.add(i);
        }
        System.out.println(list);
        int len=50_001;
        for(Integer x : list) {
            int startInd=-1,endInd=0;
            for(int i=0;i<nums.length;i++) {
                if(nums[i]==x) {
                    if(startInd==-1) startInd=i;
                    endInd=i;
                }
            }
            len=Math.min(len,endInd-startInd+1);
        }
        return len;
    }
}