package com.demo.Design_pattern;

public class TestLazySingletonPattern {
    public static void main(String[] args) {
        LazySingletonPattern l1=LazySingletonPattern.getSoleinstance();
        LazySingletonPattern l2=LazySingletonPattern.getSoleinstance();
        System.out.println(l1.hashCode()+","+l2.hashCode());
        System.out.println(l1==l2);
    }
}
