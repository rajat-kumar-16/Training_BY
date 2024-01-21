class thread3 extends Thread{
    public void run(){
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("t3 :" + i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
        }

    }
}
class thread2 extends Thread{
    public void run(){
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("t2 :" + i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
class thread1 extends Thread{
    // make it as a child of Thread
    //override thr run method always public
    public void run(){
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("t1 :" + i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            //catch the exception
        }

    }
}

class timer extends Thread{
    public void run(){
        try {
            int h=0;
            int m=0;
            int s=0;
            for(s=0;s<=59;s++){
                System.out.print("\r");
                System.out.print(h + ":" + m + ":" + s);
                Thread.sleep(1000);
                if(s==59){
                    m++;
                    s=-1;
                }
                if(m==59){
                    h++;
                }
            }

        }catch (Exception e){
            // for exception from sleep method of thread
        }

    }
}
class MultiThreading1 {
    public static void main(String[] args) {
        thread1 t1= new thread1();
        thread2 t2= new thread2();
        thread3 t3= new thread3();
        timer ti=new timer();
        ti.start();
        // always call start method
        // threads will be scheduled y the thread scheduler
//        t1.start();
//        t2.start();
//        t3.start();
    }
}