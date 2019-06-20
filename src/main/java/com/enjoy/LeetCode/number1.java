package com.enjoy.LeetCode;

import java.util.*;

/**
 * @Author:waken
 * @Date: Created in 2019/6/10 21:41
 * @Description:
 */
public class number1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] nums = {3, 0, -2, -1, 1, 2};
        List<List<Integer>> integers = threeSum(nums);
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println(endTime);
        System.out.println(integers);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            int sum = 0 - nums[i];

            while (left < right) {
                if (nums[left] + nums[right] == sum) {
                    resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < sum) {
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    left++;
                } else {
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                }
            }

        }
        return resultList;
    }
}

