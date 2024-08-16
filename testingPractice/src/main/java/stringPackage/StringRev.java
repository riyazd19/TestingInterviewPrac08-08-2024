package stringPackage;

public class StringRev {
    public static void main(String[] args) {
        String str= "welcome";
        String rev=" ";
        //char[] che = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
            System.out.print(" ");
        }
       // System.out.println("spacee  "+rev);
        
    }
}
