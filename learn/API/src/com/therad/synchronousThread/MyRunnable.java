package com.therad.synchronousThread;

import java.lang.reflect.Method;

public class MyRunnable implements Runnable{
//    同步代码块 与 同步方法
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            if ("win1".equals(Thread.currentThread().getName())){
//                同步方法
                boolean b = synchronizedMethod();
                if (b){
                    break;
                }
            }
            if ("win2".equals(Thread.currentThread().getName())) {
//                同步代码块
                synchronized (MyRunnable.class) {
                    if (ticket == 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticket--;
                        System.out.println(java.lang.Thread.currentThread().getName() + "在卖票，还剩下" + ticket + "张票");
                    }
                }

            }
            }

    }

    private static synchronized boolean synchronizedMethod() {//静态方法
        if (ticket==0){
            return true;
        }else{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(java.lang.Thread.currentThread().getName()+"在卖票，还剩下"+ticket+"张票");
            return false;
        }
    }
}
