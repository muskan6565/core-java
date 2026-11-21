package Threads.com; //very important concept************
class Queue{
	private int data;
	boolean isPresent=false;

	public synchronized void setData(int data) {
		if(isPresent==false) {
			this.data=data;
			System.out.println("Producer produces "+data);
			isPresent=true;
			notify();
		}
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}
	public synchronized  void getData() {
		if(isPresent==true) {

			System.out.println("Consumer consumes "+data);
			notify();
			isPresent=false;
		}
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}


	}
}
class Producer extends Thread{
	Queue q;
	public Producer(Queue q) {
		this.q=q;
	}
	@Override
	public void run() {
		int i=1;
		for( ; ;) {
			q.setData(i++);

		}
	}
}
class Consumer extends Thread{
	Queue q;
	public Consumer(Queue q) {
		this.q=q;
	}
	@Override
	public void run() {

		for( ; ;) {
			q.getData();

		}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c= new Consumer(q);
		p.setName("PRODUCER");
		c.setName("CONSUMER");
		p.start();
		c.start();

	}

}
