// Q48: Create 3 threads using Runnable. Each prints 1 to 5 with 500ms delay

class MyThread implements Runnable {

    public void run() {
        try {
            // loop from 1 to 5
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);

                Thread.sleep(500); // pause for 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class RunnableThreadsDemo {
    public static void main(String[] args) {

        // creating runnable object
        MyThread obj = new MyThread();

        // creating 3 threads
        Thread t1 = new Thread(obj, "Thread-1");
        Thread t2 = new Thread(obj, "Thread-2");
        Thread t3 = new Thread(obj, "Thread-3");

        // start threads
        t1.start();
        t2.start();
        t3.start();
    }
}