package com.demo.Design_pattern.Builder;

public class TestBuilderDesign {
    public static void main(String[] args) {
        PhoneDesign phone= new PhoneDesign.phoneBuilder()
                .setOs("Android").setRam(4).setStorage(256)
                .setScreensize(150.5).build();

        System.out.println(phone);
        phone.showDetails();
    }


}
