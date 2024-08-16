package exceptionalHandeling;

public class ProgOne {
    public static void main(String[] args) {
        
        //int myint= Integer.parseInt(1234);
        try {
            int myint1= Integer.parseInt("abcd");
            System.out.println("in try block");
        } catch (Exception e) {
            System.out.println("in catch block");

        }
        
    }
}
