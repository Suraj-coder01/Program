// Q52: Demonstrate thread states using sleep and join

class ThreadStatesDemo {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread running...");
                Thread.sleep(1000); // sleep state
                System.out.println("Thread finished");
            } catch (Exception e) {}
        });

        System.out.println("State before start: " + t1.getState());

        t1.start();

        System.out.println("State after start: " + t1.getState());

        t1.join(); // wait for thread to finish

        System.out.println("State after completion: " + t1.getState());
    }
}
