class Kr extends Thread {
    public void run() {
        for(int i = 0; i<100; i++) {
            System.out.println("Hello ");
            try {
                Thread.sleep(5);
            } catch (Exception e) {

            }
        }
    }
    public void run(int a) {
        for(int i = 0; i<100; i++) {
            System.out.println("The number is : " + a);
        }
    }
}

class Ar extends Thread {
    public void run() {
        for(int i = 0; i<100; i++) {
            System.out.println("Hi ");
            try {
                Thread.sleep(5);
            } catch(Exception e) {

            }
        }
    }
    public void run(int b) {
        for(int i = 0; i<100; i++) {
            System.out.println("The number is : " + b);
        }
    }
}

class Ze implements Runnable{
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println("HELLO");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Yt extends A implements Runnable{  //can be used to extend some other class
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println("BYE");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
        }
    }
}
public class Threads {
    
    public static void main(String[] args) {
        Kr k = new Kr();
        Ar a = new Ar();
        k.start();  //calls run() of Kr class  (can execute parallaly)
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        a.start();  //calls run() of Ar class  (can execute parallaly)
        k.run(7);  // can't execute parallaly
        a.run(5);  // can't execute parallaly
        k.run();  // can't execute parallaly
        a.run();  // can't execute parallaly
        System.out.println(k.getPriority()); //priority ranges from 1 to 10 where 1 means the least priority and 10 is the max priority
        System.out.println(a.getPriority()); //default priority is 5
        System.out.println(Thread.MAX_PRIORITY);  //10
        System.out.println(Thread.MIN_PRIORITY);  //1
        System.out.println(Thread.NORM_PRIORITY);  //5
        a.setPriority(10);
        //using priority we can suggest our schedular to give priority that we have set whenever possible otherwise it will work according to itself that how its programmed
        Runnable z = new Ze();
        Runnable y = new Yt();
        z.run();  // will not execute parallaly as they are not threads yet...thread will execute only when its called with start() of Thread class
        y.run(); //will not execute parallaly
        Thread t1 = new Thread(z);
        Thread t2 = new Thread(y);
        t1.start();  //will execute run() of Runnable object passed through its constructor
        t2.start();  //will execute run() of Runnable object passed through its constructor
    }
}
