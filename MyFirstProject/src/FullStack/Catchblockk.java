package FullStack;

public class Catchblockk {
    public static void main(String args[]) {
        try {
            String str = null;
            System.out.println(str.length());
            int a = 101/0;
            System.out.println(a);
        }
        catch (Exception ex) {
            if (ex instanceof NullPointerException) {
                System.out.println(ex);
                System.out.println("ALL is well");
            }
            else if (ex instanceof ArithmeticException) {
                System.out.println(ex);
                System.out.println("Hello world");
            }
        }
    }
}



