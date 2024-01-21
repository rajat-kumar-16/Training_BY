import java.util.* ;
class multiThreadingClass extends Thread{
    public synchronized void run(){
        //by using synchronized it will avoid collision of threads
        //control the access of multiple threads at a single time
        try {
            for (int i = 0; i <= 5; i++) {
                if (Thread.currentThread().getName().equals("BMW")) {
                    System.out.println("BMW :" + i);
                }
                if (Thread.currentThread().getName().equals("BENZ")) {
                    System.out.println("     BENZ :" + i);
                }
                Thread.sleep(1000);
            }
        }catch (Exception e){

        }
    }
}
public class MultiThreading2 extends Thread{
    public static void main(String[] args) {
        multiThreadingClass m = new multiThreadingClass();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        t2.start();
        t1.start();
//            t1.setPriority(7);
        //setPriority is to set the priority of thread, it doesn't mean that t1 will always finish firts
        t1.setName("BMW");
        t2.setName("BENZ");
//        t1.stop();
//        try{
//            for(int k=0;k<=30;k++){
//                System.out.println("             K:"+k);
//                Thread.sleep(1000);
//                if(k==4){
//                    t1.suspend();
//                }
//                if(k==8){
////                    System.out.println(t1.isAlive());
//                    t2.wait();
//                }
//                if(k==18){
//                    t1.resume();
//                }
//                if(k==20){
//                    t2.notify();
//                }
////                System.out.println(t2.isAlive());
//            }
//        }catch(Exception e){
//        }
    }
}
