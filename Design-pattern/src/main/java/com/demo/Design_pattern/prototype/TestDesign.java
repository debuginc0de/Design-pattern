package com.demo.Design_pattern.prototype;

public class TestDesign {
    public static void main(String[] args) {
        Student original=new Student("Rahul",61);
        Student copy= (Student) original.clone();

        original.show();
        copy.show();
    }

}
