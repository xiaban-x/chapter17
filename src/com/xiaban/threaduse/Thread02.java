package com.xiaban.threaduse;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start();不能调
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("嗯"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
