package bin.demo09.runnabledemo;
/**
 * ThreadDemo01
 */
class MyThread implements Runnable{

    private String name;
    public MyThread(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + " Excuting,i = " + i);
        }
    }
};

public class RunnableDemo01 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("Thread 1");
        MyThread mt2 = new MyThread("Thread 2");
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }
    
}