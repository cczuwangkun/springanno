package com.enjoy.LeetCode;

/**
 * @Author:waken
 * @Date: Created in 2019/6/12 13:42
 * @Description:
 */
public class number2 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        int cache = 0;
        while (l1 != null || l2 != null || cache != 0) {
            int tmp = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + cache;
            cache = tmp / 10;
            p.next = new ListNode(tmp % 10);
            p = p.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        return dummy.next;
    }

    public class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
