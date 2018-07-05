package bin.demo09.threaddemo;
/**
 * ThreadDemo01
 */
class MyThread extends Thread {

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

public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("Thread 1");
        MyThread mt2 = new MyThread("Thread 2");
        mt1.start();
        mt2.start();
    }
    
}