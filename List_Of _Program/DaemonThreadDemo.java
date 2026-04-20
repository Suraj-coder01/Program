// Q50: Demonstrate daemon thread

class DaemonThreadDemo {
    public static void main(String[] args) {

        Thread userThread = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("User Thread running...");
            }
        });

        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon Thread running...");
            }
        });

        daemonThread.setDaemon(true); // make daemon

        userThread.start();
        daemonThread.start();
    }
}
