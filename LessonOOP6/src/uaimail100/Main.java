// thread, multithreading part 1

package uaimail100;

public class Main {

    public static void main(String[] args) {

        // main thread--------------------------------------------------------------------------------
        Thread thr = Thread.currentThread();

        System.out.println(thr.getName());
        try {
            thr.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("main thread break");
        }
        System.out.println("Stop programm");
        System.out.println();

        // other threads------------------------------------------------------------------------------
        FactorialTask taskOne = new FactorialTask(3); // for task
        FactorialTask taskTwo = new FactorialTask(3);
        FactorialTask taskThree = new FactorialTask(3);

        Thread threadOne = new Thread(taskOne); // create thread
        Thread threadTwo = new Thread(taskTwo);
        Thread threadThree = new Thread(taskThree);

//        threadOne.setPriority(9);

		threadOne.setDaemon(true); // terminate if stop not deamon
//		threadTwo.setDaemon(true); // terminate if stop not deamon
//		threadThree.setDaemon(true); // terminate if stop not deamon

        threadOne.start();
        threadTwo.start();
        threadThree.start();

        System.out.println("threadOne.isAlive() = " + threadOne.isAlive());
        System.out.println("threadOne.getState() = " + threadOne. getState());
        System.out.println("threadOne.getPriority() = " + threadOne. getPriority());

//        threadOne.interrupt();
//        threadTwo.interrupt();
//        threadThree.interrupt();


//		try {
//			threadOne.join();
//			threadTwo.join();
//			threadThree.join();
//		}catch (InterruptedException e){	
//		}


        System.out.println(thr.getName() + " STOP");

    }

}
