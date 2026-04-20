// Q51: Producer Consumer using wait() and notify()

class Buffer {
    int value;
    boolean available = false;

    synchronized void produce(int val) throws InterruptedException {
        if (available) wait(); // wait if full

        value = val;
        System.out.println("Produced: " + val);

        available = true;
        notify(); // notify consumer
    }

    synchronized void consume() throws InterruptedException {
        if (!available) wait(); // wait if empty

        System.out.println("Consumed: " + value);

        available = false;
        notify(); // notify producer
    }
}

class ProducerConsumer {
    public static void main(String[] args) {

        Buffer b = new Buffer();

        // producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    b.produce(i);
                }
            } catch (Exception e) {}
        });

        // consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    b.consume();
                }
            } catch (Exception e) {}
        });

        producer.start();
        consumer.start();
    }
}
