// Q49: Two threads access same account using synchronization

class BankAccount {
    int balance = 1000;

    // synchronized method prevents race condition
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class BankAccountSync {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        // thread 1
        Thread t1 = new Thread(() -> acc.withdraw(700), "User-1");

        // thread 2
        Thread t2 = new Thread(() -> acc.withdraw(500), "User-2");

        t1.start();
        t2.start();
    }
}