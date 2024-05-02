package javaBasic;

public class stringConcatenation {
    public static void main(String[] args) {
        //5

        int a=100;
        int b=200;

        String x = "hello";
        String y = "world";

        double d = 12.33;

        System.out.println(x+y+a+b);
        System.out.println( a+b+x+y);
        System.out.println(x+y+a+b+d);
        System.out.println(x+y+(a+b)+d);
        System.out.println(x+y+(a+b+d));
        System.out.println(a+b+d+x+y);
        System.out.println(a+b+x+y+d);

       /* System.out.println(); is used to print output in new line;
        System.out.print(); is used to print output in same line;
        */

        System.out.println("Hello world");

        System.out.print(" Hello");
        System.out.print(" Hello");



    }
}
