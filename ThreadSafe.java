class Counter {
    int count;

    public synchronized void increment() {  //synchronized keyword makes sure that only one thread access this method at a time
        count++;
    }
}

public class ThreadSafe {
    
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i = 0; i<100000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0; i<100000; i++) {
                c.increment();
            }
        };
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
        t1.join();  //makes sure t1 finishes its execution
        t2.join();  //makes sure t2 finishes its execution
        System.out.println(c.count);
    }
}