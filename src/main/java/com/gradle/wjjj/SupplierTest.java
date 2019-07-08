package com.gradle.wjjj;

import java.util.function.Supplier;

/**
 *@author WJJJ
 *@createTime 2019/7/6 9:32
 *@description
 */

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "hello world";

        System.out.println(stringSupplier.get());
    }
}
