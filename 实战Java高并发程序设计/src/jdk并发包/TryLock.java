package jdk并发包;

import java.util.concurrent.locks.ReentrantLock;

public class TryLock implements Runnable {

    public static ReentrantLock lock1=new ReentrantLock();
    public static ReentrantLock lock2=new ReentrantLock();
    int lock;

    public TryLock(int lock){
        this.lock=lock;
    }

    @Override
    public void run() {
        if (lock==1){
            while (true){
                if (lock1.tryLock()){
                    System.out.println(Thread.currentThread().getName()+" 获得lock1");
                    try{
                        try{
                            Thread.sleep(500);
                        }catch (InterruptedException e){

                        }
                        if (lock2.tryLock()) {
                            System.out.println(Thread.currentThread().getName()+" 获得lock2");
                            try{
                                System.out.println(Thread.currentThread().getId()+" :My Job done.");
                                return;
                            }finally {
                                lock2.unlock();
                                System.out.println(Thread.currentThread().getName()+" 释放lock2");
                            }
                        }
                    }finally {
                        lock1.unlock();
                        System.out.println(Thread.currentThread().getName()+" 释放lock1");
                    }
                }
            }
        }else {
            while (true){
                if (lock2.tryLock()){
                    System.out.println(Thread.currentThread().getName()+" 获得lock2");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try{
                        if (lock1.tryLock()){
                            System.out.println(Thread.currentThread().getName()+" 获得lock1");
                            System.out.println(Thread.currentThread().getName()+" :My Job done");
                            return;
                        }
                    }finally {
                        lock2.unlock();
                        System.out.println(Thread.currentThread().getName()+" 释放lock2");
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        TryLock r1=new TryLock(1);
        TryLock r2=new TryLock(2);
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
