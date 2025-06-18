package org.leetcode.practice;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = Arrays.copyOf(nums,nums.length);
        Arrays.sort(result);
        int ind , ind1=0 , ind2=0;

        for(int i=0; i<result.length; i++) {
            ind = Arrays.binarySearch(result,target-result[i]);
            if(result[ind] + result[i] == target){
                for(int j=0; j<nums.length; j++) {
                    if(result[i] == nums[j]) {
                        ind1 = j;
                    }
                }
                for(int j=0; j<nums.length; j++) {
                    if(result[ind] == nums[j]) {
                        ind2 = j;
                    }
                }

                return new int[] {ind1,ind2};
            }
        }
        return null;
    }

}
