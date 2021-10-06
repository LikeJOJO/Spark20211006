package sql.threadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MeltyKiss {
    public static void main(String[] args) throws InterruptedException {
        Ticket ticket01 = new Ticket();

        new Thread(() -> {for (int i = 0; i < 40; i++) ticket01.sellTicket();}, "A").start();
        new Thread(() -> {for (int i = 0; i < 40; i++) ticket01.sellTicket();}, "B").start();
        new Thread(() -> {for (int i = 0; i < 40; i++) ticket01.sellTicket();}, "C").start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 40; i++) {
//                    ticket01.sellTicket();
//                }
//            }
//        }, "First").start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 40; i++) {
//                    ticket01.sellTicket();
//                }
//            }
//        }, "Second").start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 40; i++) {
//                    ticket01.sellTicket();
//                }
//            }
//        }, "Third").start();
    }
}

class Ticket {
    private int number = 30;
    private Lock lock = new ReentrantLock();
    public synchronized void sellTicket() {
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + " 卖出第 " + (number--) + " 还剩下 " + number);
            }
        } finally {
            lock.unlock();
        }
    }
}