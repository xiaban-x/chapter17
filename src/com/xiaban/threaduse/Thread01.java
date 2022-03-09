package com.xiaban.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();//启动线程
    }
}

//1.当一个类继承了Thread类，该类就可以当做线程使用
//2.重写run方法
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {
        
        while (true) {
            System.out.println("我超"+(++times));
            //让该线程休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80){
                break;
            }
        }
    }
}
