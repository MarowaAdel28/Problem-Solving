//Intersection of Two Arrays II
//link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
//easy

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int smallArr[],largeArr[],result[],ind=0;
        if(nums1.length<=nums2.length) {
            smallArr=nums1;
            largeArr=nums2;
        } else {
            smallArr=nums2;
            largeArr=nums1;
        }
        List <Integer> list=new ArrayList<>();
        int j=0;
        for(int i=0;i<smallArr.length;i++) {
            for(;j<largeArr.length;j++) {
                if(largeArr[j]==smallArr[i]) {
                    list.add(smallArr[i]);
                    j++;
                    break;
                } 
                else if(largeArr[j]>smallArr[i]) {
                    break;
                }
            }
        }
        result=new int[list.size()];
        for(Integer x:list) result[ind++]=x;
        return result;
    }
}

