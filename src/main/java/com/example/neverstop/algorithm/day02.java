package com.example.neverstop.algorithm;

import java.util.Arrays;
import java.util.List;

public class day02 {

    /**
     * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0
     *
     * ps: n = 3   print：[-1,0,1]   n = 1  print : [0]
     *
     * 1 <= 0 <= 1000
     */
    public static void main(String[] args) {

        int[] list = getList(3);

        System.out.println(list);

    }

    public static int[] getList(int n){

        int[] ints = new int[]{n};
        if(n%2!=0){
                int mid = n/2;
                ints[mid]=0;
                int j=0,z=1;
                while(j<mid){
                    ints[j]=-z;
                    ints[j+mid+1]=z;
                    z++;
                    j++;
                }
            }else{
                int j=0,jj = ints.length-1,z=1;
                while(j<jj){
                    ints[j]=z;
                    ints[jj]=-z;
                    j++;
                    jj--;
                    z++;
                }
            }

        return ints;

    }

}
