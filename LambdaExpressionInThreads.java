public class LambdaExpressionInThreads {
    
    public static void main(String[] args) {
        // Runnable obj1 = new Runnable() {
        //     public void run() {
        //         for(int i = 0; i<5; i++) {
        //             System.out.println("HELLO");
        //             try{
        //                 Thread.sleep(5);
        //             } catch(InterruptedException e) {
        //             }
        //         }
        //     }
        // };
        // Runnable obj2 = new Runnable() {
        //     public void run() {
        //         for(int i = 0; i<5; i++) {
        //             System.out.println("BYE");
        //             try{
        //                 Thread.sleep(5);
        //             } catch(InterruptedException e) {
        //             }
        //         }
        //     }
        // };
        // Runnable obj1 = () -> {
        //     for(int i = 0; i<5; i++) {
        //         System.out.println("HELLO");
        //         try{
        //             Thread.sleep(5);
        //         } catch(InterruptedException e) {
        //             }
        //     }
        // };
        // Runnable obj2 = () -> {
        //     for(int i = 0; i<5; i++) {
        //         System.out.println("BYE");
        //         try{
        //             Thread.sleep(5);
        //         } catch(InterruptedException e) {
        //             }
        //     }
        // };
        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);
        Thread t1 = new Thread(() -> {
            for(int i = 0; i<5; i++) {
                System.out.println("HELLO");
                try{
                    Thread.sleep(5);
                } catch(InterruptedException e) {
                    }
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i<5; i++) {
                System.out.println("BYE");
                try{
                    Thread.sleep(5);
                } catch(InterruptedException e) {
                    }
            }
        });
        t1.start();
        t2.start();
    }
}
