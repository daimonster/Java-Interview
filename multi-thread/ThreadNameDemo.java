/**
 * 取得和设置线程名称
 * 在Thread类中可以通过getName()方法取得线程的名称，还可以通过setName()方法设置线程
 * 的名称
 * 线程的名称一般在启动前设置，但页允许为已经运行的线程设置名称。允许两个Tread对象有相同的名称。
 */
package bin.demo09.threadname;

class MyThread implements Runnable{
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + 
            "运行， i =" +  i);
        }
    }
};

public class ThreadNameDemo{
    public static void main(String[] args) {
        MyThread my = new MyThread();
        new Thread(my).start();
        new Thread(my,"线程-A").start();// 手动设置线程名称
        new Thread(my,"线程-B").start();
        new Thread(my).start();
        new Thread(my).start();
    }
};
 