import java.io.*;
import java.util.*;
//try and catch exceptions to avoid termination the compilation for another methods
class throwException{
    void abc() throws FileNotFoundException{ // adding checked exceptions
        for(int i=0;i<20;i++){
            // throwing the exceptions manually using throw
            if(i==16) throw new ArithmeticException(); // unchecked exception, runtime
            if(i==15) throw new FileNotFoundException(); // check exception, compile time
            System.out.println(i);
        }
    }
}
public class Exceptions {
    static void method1(){
        method2();
        System.out.println("Method 1");
    }
    static void method2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Method 2");
        try{
            System.out.print("Enter A: ");
            int a=sc.nextInt();
            System.out.print("Enter B: ");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("result: "+c);
        }catch(InputMismatchException im) {// add | to add another exception
            System.out.println("Hey Enter the numbers only...");
            method2();
        }catch (ArithmeticException ae){
            System.out.println("You can't divide any number by 0");
            method2();
        }
        finally{// it executes always
            System.out.println("Thank You..... ");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        // if method has checked exception it's parent method where it is being called must declare it beforehand
        throw1();
        method1();
        try{
            throwException t = new throwException();
            t.abc();
        }catch(ArithmeticException ae){
            System.out.println("ArithmeticException found");
        }
        catch(FileNotFoundException fnf){
            System.out.println("FileNotFoundException found");
        }
        // default exception handler will be last
    }
    static void throw1() throws FileNotFoundException { //using throws we are declaring the exceptions
        File f = new File("abc.txt");
        FileReader fr= new FileReader(f);
    }
}