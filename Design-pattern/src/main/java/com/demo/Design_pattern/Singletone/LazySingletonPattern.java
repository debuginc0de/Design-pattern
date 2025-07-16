package com.demo.Design_pattern.Singletone;

public class LazySingletonPattern {
    private static volatile LazySingletonPattern lazygetInstance;
    private LazySingletonPattern(){
        System.out.println("Singleton instance created....");
    }
    public static LazySingletonPattern getSoleinstance(){
        if (lazygetInstance==null){
            synchronized (LazySingletonPattern.class){
                if(lazygetInstance==null){
                    lazygetInstance=new LazySingletonPattern();
                }
            }
        }
        return lazygetInstance;
    }

}
