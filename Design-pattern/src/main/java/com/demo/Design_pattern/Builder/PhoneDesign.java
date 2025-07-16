package com.demo.Design_pattern.Builder;

public class PhoneDesign {
    private String os;
    private int ram;
    private int storage;
    private double screensize;


    //private constructor
    public PhoneDesign(phoneBuilder builder){
        this.os=builder.os;
        this.ram=builder.ram;
        this.storage=builder.storage;
        this.screensize=builder.screensize;

    }
//    public String getOs() {
//        return os;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public int getStorage() {
//        return storage;
//    }
//
//    public double Screensize() {
//        return screensize;
//    }
    public static class phoneBuilder{
        private String os;
        private int ram;
        private int storage;
        private double screensize;

        phoneBuilder setOs(String os){
            this.os=os;
            return this;
        }

        phoneBuilder setRam(int ram){
            this.ram=ram;
            return this;
        }
        phoneBuilder setStorage(int storage){
            this.storage= storage;
            return this;
        }
        phoneBuilder setScreensize(double screensize){
            this.screensize=screensize;
            return this;
        }
        public PhoneDesign build(){
            return new PhoneDesign(this);
        }
    }

    @Override
    public String toString() {
        return "PhoneDesign{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", screensize=" + screensize +
                '}';
    }
    public void showDetails(){
        System.out.println("OS: "+os+", Storage: "+storage+", ScreenSize: "+screensize+", Ram: "+ram);
    }
}
