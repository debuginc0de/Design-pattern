package com.demo.Design_pattern.prototype;

class Student implements prototype {
    private String name;
    private int roll;

    public Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }

    //copy constructor
    public Student(Student s){
        this.name=s.name;
        this.roll=s.roll;
    }

    @Override
    public prototype clone() {
        return new Student(this);
    }
    public void show(){
        System.out.println("Name: "+name+", Roll: "+roll);
    }
}
