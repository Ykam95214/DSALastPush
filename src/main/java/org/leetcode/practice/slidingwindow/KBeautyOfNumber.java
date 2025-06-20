package org.leetcode.practice.slidingwindow;

public class KBeautyOfNumber {
    public int divisorSubstrings(int num, int k) {

        int count=0 ;

        int i=0 , quot=0 , dividend = num , formedNum = 0;

        while(i < k) {
            quot = dividend%10;
            dividend = dividend/10;
            formedNum += (int) Math.pow(10,i)*quot;
            i++;
        }

        if(formedNum !=0 && num % formedNum == 0) {
            count++;
        }

        while(dividend > 0) {
            quot = dividend % 10;
            formedNum = (int) Math.pow(10,k-1)*quot + formedNum/10;
            if(formedNum !=0 && num % formedNum == 0) {
                count++;
            }
            dividend/=10;
        }

        return count;
    }
}
