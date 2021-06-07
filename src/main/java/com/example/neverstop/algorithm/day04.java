package com.example.neverstop.algorithm;

public class day04 {


    /**
     * 给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
     *
     * 数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。
     *
     *  示例 1：
     *
     * 输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
     * 输出：true
     * 解释：
     * word1 表示的字符串为 "ab" + "c" -> "abc"
     * word2 表示的字符串为 "a" + "bc" -> "abc"
     * 两个字符串相同，返回 true
     *
     *  示例 2：
     *
     * 输入：word1 = ["a", "cb"], word2 = ["ab", "c"]
     * 输出：false
     *  示例 3：
     *
     * 输入：word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
     * 输出：true
     *
     *
     */

    public static void main(String[] args) {
        String[] word1 = new  String[]{"ab", "c"};
        String[] word2 = new  String[]{"ab", "bc"};
        boolean b = arrayStringsAreEqual(word1, word2);
        System.out.println(b);

    }



    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        for (int i = 0 ;i < word1.length ; i++){
            s1.append(word1[i]);

        }

        for (int y = 0 ; y < word2.length ; y ++){
            s2.append(word2[y]);
        }

        if (new String(s1) .equals(new String(s2))){
            return true;
        }else {
            return false;
        }


    }
}
