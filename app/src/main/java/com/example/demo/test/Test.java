package com.example.demo.test;

public class Test {

    public boolean checkTwoSum(int[] nums, int k) {
        for (int n : nums) {
            for (int i : nums) {
                if (n != i) {
                    return n + i == k;
                }
            }
        }
        return false;
    }

}
