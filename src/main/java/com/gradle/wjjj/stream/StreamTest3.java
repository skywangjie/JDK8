package com.gradle.wjjj.stream;

import java.util.Arrays;
import java.util.List;

/**
 *@author WJJJ
 *@createTime 2019/7/7 0:42
 *@description
 */

public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //reduce终止操作 及早求值                         求和，传递2个参数返回一个参数Bifunction
        System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));//map 映射
    }
}
