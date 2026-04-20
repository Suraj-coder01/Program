// Q53: Create a ThreadGroup "CompanyWorkers" and add 3 threads
import java.io.*;
class ThreadGroupDemo {
    public static void main(String[] args) {

        // creating thread group
        ThreadGroup tg = new ThreadGroup("CompanyWorkers");

        // thread task
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " running");
        };

        // creating threads inside group
        Thread t1 = new Thread(tg, task, "Worker-1");
        Thread t2 = new Thread(tg, task, "Worker-2");
        Thread t3 = new Thread(tg, task, "Worker-3");

        t1.start();
        t2.start();
        t3.start();

        // display group info
        System.out.println("Group Name: " + tg.getName());
        System.out.println("Active Threads: " + tg.activeCount());
    }
}