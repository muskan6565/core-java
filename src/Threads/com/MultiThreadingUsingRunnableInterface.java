package Threads.com;
class Deposit implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Amount deposited: " + (i * 1000));

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Withdrawal implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Amount withdrawn: " + (i * 500));

            try {
                Thread.sleep(1500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}




public class MultiThreadingUsingRunnableInterface {

	public static void main(String[] args) {
		

        Deposit d = new Deposit();
        Withdrawal w = new Withdrawal();

        Thread t1 = new Thread(d);
        Thread t2 = new Thread(w);

        t1.start();
        t2.start();
	}

}
