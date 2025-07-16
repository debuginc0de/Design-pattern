package com.demo.Design_pattern;

public class TestEagerSingletonePattern {
    public static void main(String[] args) {
        EagerSingletonePattern p1=EagerSingletonePattern.getinstance();
        EagerSingletonePattern p2=EagerSingletonePattern.getinstance();

        System.out.println(p1.hashCode()+","+p2.hashCode());
        System.out.println(p1.equals(p2));
    }
}
