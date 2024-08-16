package stringPackage;

import java.util.Scanner;

public class CheckingPalandrome {
    
    public static void main(String[] args) {
        System.out.println("  Enter the string value for string one");
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        StringBuffer str2= new StringBuffer(s);
        StringBuffer st3= str2.reverse();
        if(st3.equals(str2)){
            System.out.println("palandrome string");
        }
        

    }
}
