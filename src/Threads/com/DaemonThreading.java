package Threads.com;
class MyThread1 extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running");
        } else {
            System.out.println("User thread is running");
        }
    }
}




public class DaemonThreading {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.setDaemon(true);

        t1.start();
        t2.start();

	}

}
