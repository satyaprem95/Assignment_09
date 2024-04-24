package Assignment_09;

public class Main {
    public static void main(String[] args) {
        thread thread1 = new thread("Thread 1");
        thread thread2 = new thread("Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();

        // Check if threads are alive
        System.out.println(thread1.getName() + " is alive: " + thread1.isAlive());
        System.out.println(thread2.getName() + " is alive: " + thread2.isAlive());

        try {
            // Wait for thread1 to finish
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println(thread1.getName() + " is alive: " + thread1.isAlive());
        System.out.println(thread2.getName() + " is alive: " + thread2.isAlive());

        // Set the name of thread2
        thread2.setName("Renamed Thread 2");
        System.out.println("Renamed thread2 name: " + thread2.getName());
    }
}
