package cn.lhz.lib_java.thread;

/*
	Thread.yield();
	
	1.该方法是一个静态方法
	2.作用：给同一个优先级的线程让位，但是让位时间不确定
	3.和sleep方法相同，但就是时间不固定
	
*/
public class TestJoinAndYield {
    public static void main(String[] args) {
        Thread t = new TestProcessor();
        t.setName("t");
        t.start();

//        Thread t2 = new processor();
//        t2.setName("t2");
//        t2.start();

        //合并进程,成员方法，t和主线程合并，合并了就是单线程的程序
//		try {
//			t.join();
////            t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		//主线程中
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
//            try {
//                Thread.sleep(2);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}