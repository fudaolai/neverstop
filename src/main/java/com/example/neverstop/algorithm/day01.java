package com.example.neverstop.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day01 {

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * ps:[4,1,2,1,2]  println: 4
     */

    /**
     * 方式一：
     */
    public static void main(String[] args) {

        int[] ints = new int[]{4,1,2,1,2};

        List<Integer> list = new ArrayList<>();

        //遍历集合放进新的集合中， 如果集合中已经存在此元素 则删除（因为其余每个元素均出现两次） 不存在则添加
        for (int i = 0; i < ints.length ; i ++){
            if (list.contains(ints[i])){
                list.remove((Integer) ints[i]);
            }else {
                list.add(ints[i]);
            }
        }

        System.out.println(list.get(0));

    }

    /**
     * 方式二：
     */

//    public static void main(String[] args) {
//        int[] ints = new int[]{4,1,2,1,2};
//
//        int asInt = Arrays.stream(ints).reduce((a, b) -> a ^ b).getAsInt();
//
//        System.out.println(asInt);
//    }
}
