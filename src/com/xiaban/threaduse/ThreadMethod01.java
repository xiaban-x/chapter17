package com.xiaban.threaduse;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("嗯");
        t.setPriority(Thread.MIN_PRIORITY);//设置优先级为1
        t.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);
        }

        System.out.println(t.getName()+"线程的优先级 = "+t.getPriority());
        t.interrupt();//终止休眠
    }
}

class T extends Thread {
    @Override
    public void run() {

        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "wochao" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println(Thread.currentThread().getName() + "被interrupt了");

            }
        }
    }
}
