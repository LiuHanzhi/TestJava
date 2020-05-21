package cn.lhz.lib_java.thread;

public class TestProcessor extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
//            try {
//                Thread.sleep(2);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            if (i % 20 == 0) {
                Thread.yield();
            }
        }
    }
}