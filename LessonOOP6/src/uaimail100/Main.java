package uaimail100;

public class Main {

	public static void main(String[] args) {
		
		Thread thr = Thread.currentThread();
		
		FactorialTask taskOne = new FactorialTask(10); // for task
		FactorialTask taskTwo = new FactorialTask(10);
		FactorialTask taskThree = new FactorialTask(10);
		
		Thread threadOne = new Thread(taskOne); // create thread
		Thread threadTwo = new Thread(taskTwo);
		Thread threadThree = new Thread(taskThree);
		
		threadOne.setPriority(9);
		
//		threadOne.setDaemon(true); // terminate if stop not deamon
//		threadTwo.setDaemon(true); // terminate if stop not deamon
//		threadThree.setDaemon(true); // terminate if stop not deamon
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		
		System.out.println(threadOne.isAlive());
		
		threadOne.interrupt();
		threadTwo.interrupt();
		threadThree.interrupt();

		
//		try {
//			threadOne.join();
//			threadTwo.join();
//			threadThree.join();
//		}catch (InterruptedException e){	
//		}
		
		
		
		System.out.println(thr.getName() + " STOP");
		
	}

}
