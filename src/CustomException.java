import java.util.*;
class throwCustom{
    void display() throws invalidAgeException{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age= sc.nextInt();
        if(age <=18){
            throw new invalidAgeException("grow up kid");
        }else{
            System.out.println("Age "+age);
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        try{
            throwCustom t= new throwCustom();
            t.display();
        }catch(invalidAgeException iae){
            System.out.println("Under age boy..."+ iae.getMessage());
        }


    }
}
class invalidAgeException extends Exception{
    // Make the customException as a child of exception class
    invalidAgeException(String args){
        // can pass any argument
        // these are checked exceptions
        // important to pass it to super
        super(args);
    }
}
