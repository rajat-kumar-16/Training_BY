public class Strings {
    public static void main(String[] args) {
        String a="         hello  ";
        String c= new String("         hello  ");
        System.out.println(c == a); // prints false
        System.out.println(c.equals(a)); // prints true
        System.out.println(a.charAt(0));
        String b=a.trim();
        System.out.println(b);
        // in an object if we have a string, then we have to override the toString method to
        // to print that String while printing the object.

        //.equals means content checking
        //.toUpperCase
        //.toLowerCase
        //.trim()
        //.trim().length();
        //.split("/s");
        // a.startsWith()
        // == means reference checking
        // we can override all these methods
        b=b.concat("hey"); // String is immutable, but we override here;
        System.out.println(b.concat("hey"));
        StringBuffer d=new StringBuffer("Rajat");// it is mutable can we changed without overriding
        d.append(" Kumar");
        System.out.println(d);

    }
}
