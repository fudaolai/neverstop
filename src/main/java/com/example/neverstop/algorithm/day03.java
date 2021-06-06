package com.example.neverstop.algorithm;

import java.util.Arrays;

public class day03 {


    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     *
     * 输入：nums = [-4,-1,0,3,10]
     * 输出：[0,1,9,16,100]
     * 解释：平方后，数组变为 [16,1,0,9,100]
     * 排序后，数组变为 [0,1,9,16,100]
     *
     * 进阶：
     *  请你设计时间复杂度为 O(n) 的算法解决本问题
     */

    //思路： 一个非递减顺序的整数数组  计算平方，快速排序
    public static void main(String[] args) {

        int[] ints = new int[]{-4,-1,0,3,10};

        //计算新数组
        for (int i = 0 ; i < ints.length; i ++){
            ints[i] = ints[i] * ints[i];
        }

        //排序
        Arrays.sort(ints);

        System.out.println(ints);



    }








}
