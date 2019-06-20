package com.enjoy.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:waken
 * @Date: Created in 2019/6/13 14:57
 * @Description:
 */
public class number3 {
    public static void main(String[] args) {
        String s = "pwwkew";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int maxLength = 0;

        for (int end = 0, start = 0; end < s.length(); end++) {
            char value = s.charAt(end);

            if (map.containsKey(value)) {
                start = Math.max(map.get(value), start);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            map.put(value, end+1);
        }

        System.out.println(maxLength);
    }
}
