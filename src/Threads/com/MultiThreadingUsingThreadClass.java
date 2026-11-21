package Threads.com;
class DemoMultiThread extends Thread{
	@Override
	public void run() {
	Thread	t= currentThread();
	System.out.println(t + "is Executing");
	}
	
}

public class MultiThreadingUsingThreadClass {

	public static void main(String[] args) {
		DemoMultiThread d1=new DemoMultiThread();
		DemoMultiThread d2=new DemoMultiThread();
		d1.start();
		d2.start();
		
		

	}

}
