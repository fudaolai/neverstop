package com.example.neverstop.algorithm;

public class day06 {


    /**
     * 实现字符串反转
     * ps：String str = "abc123"   输出 ： 321cba
     */


    public static void main(String[] args) {

        //第一种：使用reverse
        String str = "abc123";
//
//        StringBuffer sb = new StringBuffer(str);
//
//        StringBuffer reverse = sb.reverse();
//        System.out.println(reverse);


        //第二种方式
        char[] chars = str.toCharArray();

        String res = "";
        for (int i = str.length() - 1; i >=0 ;i --){

            System.out.println(chars[i]);
            res += chars[i];
        }
        System.out.println(res);

    }

}
